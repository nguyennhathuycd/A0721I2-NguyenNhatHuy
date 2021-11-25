package service;

import javafx.scene.transform.Scale;
import models.*;
import util.BookingComparator;
import util.ReadAndWriteFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingServiceImpl implements BookingService{
    private CustomerService customerService = new CustomerServiceImpl();
    private FacilityService facilityService = new FacilityServiceImpl();
    private List<Villa> villaList  = ReadAndWriteFile.readVillaListFromCSV();
    private List<House> houseList  = ReadAndWriteFile.readHouseListFromCSV();
    private List<Room> roomList  = ReadAndWriteFile.readRoomListFromCSV();
    private List<Customer> customerList = ReadAndWriteFile.readCustomerListFromCSV();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showList() {
        List<Booking> bookingList = ReadAndWriteFile.readBookingListFromCSV();
        Collections.sort(bookingList, new BookingComparator());
        for (Booking booking: bookingList) {
            System.out.println(booking);
        }
    }

    @Override
    public void add() {
        customerService.showList();
        int customerIndex;
        while (true) {
            try {
                System.out.println("Choose customer:");
                customerIndex = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parst to number.\nTry agian!\n");
                continue;
            }
            if (customerIndex <= 0 || customerIndex > customerList.size()) {
                System.out.println("\nError: Invaid customer.\nTry again!\n");
                continue;
            }
            break;
        }

        int facilitySize = (villaList.size() + houseList.size() + roomList.size());
        facilityService.showList();
        int facilityIndex;
        while (true) {
            try {
                System.out.println("Choose facility:");
                facilityIndex = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parst to number.\nTry agian!\n");
                continue;
            }
            if (facilityIndex <= 0 || facilityIndex > facilitySize) {
                System.out.println("\nError: Invaid facility.\nTry again!\n");
                continue;
            }
            break;
        }

        System.out.println("Booking code:");
        String bookingCode = scanner.nextLine();
        String startDay;
        while (true) {
            System.out.println("Start day: (dd/MM/yyyy)");
            startDay = scanner.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            try {
                df.parse(startDay);
            }
            catch (ParseException e) {
                System.out.println("\nError: Invalid date.\nTry again!\n");
                continue;
            }
            break;
        }
        String endDay;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            System.out.println("End day: (dd/MM/yyyy)");
            endDay = scanner.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            try {
                df.parse(endDay);
            }
            catch (ParseException e) {
                System.out.println("\nError: Invalid date.\nTry again!\n");
                continue;
            }

            try {
                LocalDate startDayFormat = LocalDate.parse(startDay, formatter);
                LocalDate endDayFormat = LocalDate.parse(endDay, formatter);
                if (endDayFormat.compareTo(startDayFormat) < 0) {
                    System.out.println("\nError: Invalid end day.\nTry agian!\n");
                    continue;
                }
            } catch (Exception err) {
                System.out.println("\nError: Could not parst to format dd/MM/yyyy.\nTry again\n");
                continue;
            }
            break;
        }
        String serviceName;
        String serviceType;
        if (facilityIndex <= villaList.size()) {
            serviceName = villaList.get(facilityIndex - 1).getServiceName();
            serviceType = "Villa";
        } else if (facilityIndex <= (villaList.size() + houseList.size())) {
            serviceName = houseList.get(facilityIndex - villaList.size() - 1).getServiceName();
            serviceType = "House";
        } else {
            serviceName = roomList.get(facilityIndex - villaList.size() - houseList.size() - 1).getServiceName();
            serviceType = "Room";
        }

        Booking booking = new Booking(bookingCode, startDay, endDay, customerList.get(customerIndex - 1).getCustomerCode(), serviceName, serviceType);
        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking);
        ReadAndWriteFile.writeBookingListToCSV(bookingList, true);

        int newNumberOfUses;
        if (serviceType.equals("Villa")) {
            newNumberOfUses = villaList.get(facilityIndex - 1).getNumberOfUses() + 1;
            villaList.get(facilityIndex - 1).setNumberOfUses(newNumberOfUses);
            ReadAndWriteFile.writeVillaListToCSV(villaList,false);
        } else if (serviceType.equals("House")) {
            newNumberOfUses = houseList.get(facilityIndex - villaList.size() - 1).getNumberOfUses() + 1;
            houseList.get(facilityIndex - villaList.size() - 1).setNumberOfUses(newNumberOfUses);
            ReadAndWriteFile.writeHouseListToCSV(houseList,false);
        } else if (serviceType.equals("Room")){
            newNumberOfUses = roomList.get(facilityIndex - villaList.size() - houseList.size() - 1).getNumberOfUses() + 1;
            roomList.get(facilityIndex - villaList.size() - houseList.size() - 1).setNumberOfUses(newNumberOfUses);
            ReadAndWriteFile.writeRoomListToCSV(roomList,false);
        }
        System.out.println("\nBooking is successfully!\n");
    }
}
