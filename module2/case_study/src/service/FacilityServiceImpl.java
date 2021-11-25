package service;

import models.House;
import models.Room;
import models.Villa;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String showListFacilityMaintenance() {
        return "";
    }

    @Override
    public void showList() {
        System.out.println("\nDisplay Facility list:");
        List<Villa> villaList = ReadAndWriteFile.readVillaListFromCSV();
        int index = 0;
        for (int i=0;i<villaList.size();i++){
            System.out.println((index+1)+"."+villaList.get(i));
            index++;
        }
        List<House> houseList = ReadAndWriteFile.readHouseListFromCSV();
        for (int i=0;i<houseList.size();i++){
            System.out.println((index+1)+"."+houseList.get(i));
            index++;
        }
        List<Room> roomList = ReadAndWriteFile.readRoomListFromCSV();
        for (int i=0;i<roomList.size();i++){
            System.out.println((index+1)+"."+roomList.get(i));
            index++;
        }
        System.out.println();
    }

    @Override
    public void add() {
        int faclityOption = 0;
        while (true) {
            try {
                System.out.println("1.\tAdd New Villa");
                System.out.println("2.\tAdd New House");
                System.out.println("3.\tAdd New Room");
                System.out.println("4.\tBack to menu");
                faclityOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                System.out.println("\nError: Could not parst option to number!\nTry agian!\n");
                continue;
            }

            if (faclityOption < 1 && faclityOption >4) {
                System.out.println("\nError: Invalid number.\nTry agian!\n");
                continue;
            }
            break;
        }

        if (faclityOption == 4) {
            return;
        }

        System.out.println("Id:");
        String id = scanner.nextLine();
        System.out.println("Service name:");
        String serviceName = scanner.nextLine();

        double usableArea;
        while (true) {
            try {
                System.out.println("Usable area: (m2)");
                usableArea = Double.parseDouble(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Invalid usable area.\nTry again!\n");
                continue;
            }
            break;
        }
        double rentalCosts;
        while (true) {
            try {
                System.out.println("Rental costs: ($)");
                rentalCosts = Double.parseDouble(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Invalid rental costs.\nTry again!\n");
                continue;
            }
            if (rentalCosts <= 0) {
                System.out.println("\nError: Invalid rental costs.\nTry again!\n");
                continue;
            } else {
                break;
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.println("Maximum people:");
                maxPeople = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Invalid maximum people.\nTry again!\n");
                continue;
            }
            if (maxPeople <= 0) {
                System.out.println("\nError: Invalid maximum people.\nTry again!\n");
                continue;
            } else {
                break;
            }
        }

        String rentalType;
        while (true) {
            System.out.println("Rental type: (year or month or day or hour)");
            rentalType = scanner.nextLine();
            rentalType = rentalType.toLowerCase();

            if (rentalType.equals("year") || rentalType.equals("month") || rentalType.equals("day") || rentalType.equals("hour")) {
                break;
            }
        }

        int numberOfUses = 0;

        if (faclityOption == 1) {
            System.out.println("Room standard:");
            String roomStandard = scanner.nextLine();
            double poolArea;
            while (true) {
                try {
                    System.out.println("Pool area: (m2)");
                    poolArea = Double.parseDouble(scanner.nextLine());
                } catch (Exception err) {
                    System.out.println("\nError: Invalid pool area.\nTry again!\n");
                    continue;
                }
                if (poolArea <= 0) {
                    System.out.println("\nError: Invalid pool area.\nTry again!\n");
                    continue;
                } else {
                    break;
                }
            }

            int numberOfFloors;
            while (true) {
                try {
                    System.out.println("Number of floors:");
                    numberOfFloors = Integer.parseInt(scanner.nextLine());
                } catch (Exception err) {
                    System.out.println("\nError: Invalid number of floors.\nTry again!\n");
                    continue;
                }
                if (maxPeople < 0) {
                    System.out.println("\nError: Invalid number of floors.\nTry again!\n");
                    continue;
                } else {
                    break;
                }
            }
            Villa villa = new Villa(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, 0 ,roomStandard, poolArea, numberOfFloors);
            List<Villa> villaList = new ArrayList<>();
            villaList.add(villa);
            ReadAndWriteFile.writeVillaListToCSV(villaList,true);
        } else if (faclityOption == 2) {
            System.out.println("Room standard:");
            String roomStandard = scanner.nextLine();
            int numberOfFloors;
            while (true) {
                try {
                    System.out.println("Number of floors:");
                    numberOfFloors = Integer.parseInt(scanner.nextLine());
                } catch (Exception err) {
                    System.out.println("\nError: Invalid number of floors.\nTry again!\n");
                    continue;
                }
                if (maxPeople < 0) {
                    System.out.println("\nError: Invalid number of floors.\nTry again!\n");
                    continue;
                } else {
                    break;
                }
            }
            House house = new House(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, 0 ,roomStandard, numberOfFloors);
            List<House> houseList = new ArrayList<>();
            houseList.add(house);
            ReadAndWriteFile.writeHouseListToCSV(houseList,true);
        } else if (faclityOption == 3) {
            System.out.println("Free service included:");
            String freeServiceIncluded = scanner.nextLine();
            Room room = new Room(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, numberOfUses ,freeServiceIncluded);
            List<Room> roomList = new ArrayList<>();
            roomList.add(room);
            ReadAndWriteFile.writeRoomListToCSV(roomList,true);
        }
    }
}
