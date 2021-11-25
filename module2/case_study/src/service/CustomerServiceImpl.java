package service;

import models.Customer;
import util.ReadAndWriteFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWriteFile.readCustomerListFromCSV();
        showList();
        int index;
        while (true) {
            try {
                System.out.println("\nChoose Customer to edit:");
                index = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parst to number.\nTry agian!\n");
                continue;
            }
            if (index <= 0 || index > customerList.size()) {
                System.out.println("\nError: Invalid customer.\nTry agian!\n");
                continue;
            }
            break;
        }

        System.out.println("Customer type:");
        String customerType = scanner.nextLine();

        System.out.println("Address:");
        String address = scanner.nextLine();

        customerList.get(index - 1).setCustomerType(customerType);
        customerList.get(index - 1).setAddress(address);
        ReadAndWriteFile.writeCustomerListToCSV(customerList,false);
    }

    @Override
    public void showList() {
        List<Customer> customerList = ReadAndWriteFile.readCustomerListFromCSV();
        System.out.println("\nDisplay Customer list:");
        for (int i=0;i<customerList.size();i++){
            System.out.println((i+1)+"."+customerList.get(i));
        }
        System.out.println();
    }

    @Override
    public void add() {
        System.out.println("\nAdd new Customer:");

        System.out.println("Name:");
        String name = scanner.nextLine();

        String birthday;
        while (true) {
            System.out.println("Birthday: ");
            birthday = scanner.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            try {
                df.parse(birthday);
            }
            catch (ParseException e) {
                System.out.println("\nError: Invalid date.\nTry again!\n");
                continue;
            }
            break;
        }

        boolean sex;
        while (true) {
            System.out.println("Sex: (true or false)");
            String str = scanner.nextLine();

            if (str.toLowerCase().equals("true") || str.toLowerCase().equals("false")) {
                sex = Boolean.parseBoolean(str.toLowerCase());
                break;
            } else {
                System.out.println("\nError: Could not parst to boolean.\nTry again!\n");
                continue;
            }
        }

        System.out.println("CMND:");
        String CMND = scanner.nextLine();

        System.out.println("Phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        System.out.println("Customer code:");
        String customerCode = scanner.nextLine();

        System.out.println("Customer type:");
        String customerType = scanner.nextLine();

        System.out.println("Address:");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, birthday, sex ,CMND, phoneNumber, email, customerCode, customerType, address);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        ReadAndWriteFile.writeCustomerListToCSV(customerList,true);
    }
}
