package interface_comparator_so_sanh_lop_hinh_hoc.service;

import interface_comparator_so_sanh_lop_hinh_hoc.model.Shape;

import java.util.Scanner;

public class ShapeService {
    private Shape shape;
    OnlyLetters onlyLetters = new OnlyLetters();

    public void add() {
        Scanner scanner = new Scanner(System.in);
        String color;
        boolean filled;

        System.out.println("\n-----Shape-----");
        while (true) {
            System.out.println("Enter color:");
            color = scanner.nextLine();
            if (!onlyLetters.isOnlyLetters(color)) {
                System.out.println("\nError: Invalid color.\nPlease enter agian\n");
                continue;
            }
            System.out.println("Is filled (enter true or false):");
            String testFilled = scanner.nextLine();
            if (!testFilled.toLowerCase().equals("true") && !testFilled.toLowerCase().equals("false")) {
                System.out.println("\nError: Invalid filled.\nPlease enter agian!\n");
                continue;
            }
            filled = Boolean.parseBoolean(testFilled);
            break;
        }
        shape = new Shape(color,filled);
    }

    public void display() {
        System.out.println(shape.toString());
    }
}
