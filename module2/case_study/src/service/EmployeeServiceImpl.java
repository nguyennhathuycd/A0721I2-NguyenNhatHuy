package service;

import models.Employee;
import util.ReadAndWriteFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void edit() {
        List<Employee> employeeList = ReadAndWriteFile.readEmployeeListFromCSV();
        showList();
        int index;
        while (true) {
            try {
                System.out.println("\nChoose Employee to edit:");
                 index = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parst to number.\nTry agian!\n");
                continue;
            }
            if (index <= 0 || index > employeeList.size()) {
                System.out.println("\nError: Invalid employee.\nTry agian!\n");
                continue;
            }
            break;
        }

        System.out.println("Position:");
        String position = scanner.nextLine();

        double salary;
        while (true) {
            try {
                System.out.println("Salary:");
                salary = Double.parseDouble(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parst salary to number.\nTry again!\n");
                continue;
            }
            if (salary <= 0) {
                System.out.println("\nError: Invalid salary.\nTry agian!\n");
                continue;
            }
            break;
        }

        employeeList.get(index - 1).setPosition(position);
        employeeList.get(index - 1).setSalary(salary);
        ReadAndWriteFile.writeEmployeeListToCSV(employeeList,false);
    }

    @Override
    public void showList() {
        List<Employee> employeeList = ReadAndWriteFile.readEmployeeListFromCSV();
        System.out.println("\nDisplay Employee list:");
        for (int i=0;i<employeeList.size();i++){
            System.out.println((i+1)+"."+employeeList.get(i));
        }
        System.out.println();
    }

    @Override
    public void add() {
        System.out.println("\nAdd new Employee:");

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

        System.out.println("Employee code:");
        String employeeCode = scanner.nextLine();

        System.out.println("Qualification:");
        String qualification = scanner.nextLine();

        System.out.println("Position:");
        String position = scanner.nextLine();

        double salary;
        while (true) {
            try {
                System.out.println("Salary:");
                salary = Double.parseDouble(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parst salary to number.\nTry again!\n");
                continue;
            }
            if (salary <= 0) {
                System.out.println("\nError: Invalid salary.\nTry agian!\n");
                continue;
            }
            break;
        }

        Employee employee = new Employee(name, birthday, sex ,CMND, phoneNumber, email, employeeCode, qualification, position, salary);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadAndWriteFile.writeEmployeeListToCSV(employeeList,true);
    }
}