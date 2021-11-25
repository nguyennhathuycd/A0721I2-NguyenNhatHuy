package util;

import models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    final static String VILLA_PATH ="src\\data\\villa.csv";
    final static String EMPLOYEE_PATH ="src\\data\\employee.csv";
    final static String CUSTOMER_PATH = "src\\data\\customer.csv";
    final static String HOUSE_PATH = "src\\data\\house.csv";
    final static String ROOM_PATH = "src\\data\\room.csv";
    final static String BOOKING_PATH = "src\\data\\booking.csv";

    private static void writeListToCSV(List<String> list, String path, boolean append){
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string: list){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("\nError: Can not write file.\n");
        }
    }

    private static List<String> readListToCSV(String path){
        List<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                list.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return list;
    }

    public static void writeVillaListToCSV(List<Villa> villaList, boolean append){
        List<String> strings = new ArrayList<>();
        for (Villa villa: villaList) {
            strings.add(villa.getInforToCSV());
        }
        writeListToCSV(strings, VILLA_PATH, append);
    }

    public static void writeHouseListToCSV(List<House> houseList, boolean append){
        List<String> strings = new ArrayList<>();
        for (House house: houseList) {
            strings.add(house.getInforToCSV());
        }
        writeListToCSV(strings, HOUSE_PATH, append);
    }

    public static void writeRoomListToCSV(List<Room> roomList, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Room room: roomList) {
            strings.add(room.getInforToCSV());
        }
        writeListToCSV(strings, ROOM_PATH, append);
    }

    public static void writeEmployeeListToCSV(List<Employee> employeeList, boolean append){
        List<String> strings = new ArrayList<>();
        for (Employee employee: employeeList) {
            strings.add(employee.getInforToCSV());
        }
        writeListToCSV(strings, EMPLOYEE_PATH, append);
    }

    public static List<Employee> readEmployeeListFromCSV(){
        List<String> list = readListToCSV(EMPLOYEE_PATH);
        List<Employee> employeeList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Employee employee = new Employee(arr[0], arr[1], Boolean.parseBoolean(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static void writeCustomerListToCSV(List<Customer> customerList, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Customer customer: customerList) {
            strings.add(customer.getInforToCSV());
        }
        writeListToCSV(strings, CUSTOMER_PATH, append);
    }

    public static List<Customer> readCustomerListFromCSV() {
        List<String> list = readListToCSV(CUSTOMER_PATH);
        List<Customer> customerList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Customer customer = new Customer(arr[0], arr[1], Boolean.parseBoolean(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    public static List<Villa> readVillaListFromCSV() {
        List<String> list = readListToCSV(VILLA_PATH);
        List<Villa> villaList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Villa villa = new Villa(arr[0], arr[1], Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),arr[5],Integer.parseInt(arr[6]),arr[7],Double.parseDouble(arr[8]),Integer.parseInt(arr[9]));
            villaList.add(villa);
        }
        return villaList;
    }

    public static List<House> readHouseListFromCSV() {
        List<String> list = readListToCSV(HOUSE_PATH);
        List<House> houseList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            House house = new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]) ,arr[7], Integer.parseInt(arr[8]));
            houseList.add(house);
        }
        return houseList;
    }

    public static List<Room> readRoomListFromCSV() {
        List<String> list = readListToCSV(ROOM_PATH);
        List<Room> roomList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Room room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]) , arr[7]);
            roomList.add(room);
        }
        return roomList;
    }

    public static void writeBookingListToCSV(List<Booking> bookingList, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Booking booking: bookingList) {
            strings.add(booking.getInforToCSV());
        }
        writeListToCSV(strings, BOOKING_PATH, append);
    }

    public static List<Booking> readBookingListFromCSV() {
        List<String> list = readListToCSV(BOOKING_PATH);
        List<Booking> bookingList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Booking booking = new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            bookingList.add(booking);
        }
        return bookingList;
    }
}