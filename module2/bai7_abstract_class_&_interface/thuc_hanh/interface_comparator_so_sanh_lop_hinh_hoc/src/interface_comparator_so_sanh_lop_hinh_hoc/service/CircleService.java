package interface_comparator_so_sanh_lop_hinh_hoc.service;

import interface_comparator_so_sanh_lop_hinh_hoc.model.Circle;

import java.util.Scanner;

public class CircleService {
    private Scanner scanner = new Scanner(System.in);
    private OnlyLetters onlyLetter = new OnlyLetters();
    private Circle circle;

    public void add() {
        double radius;
        String color;
        boolean filled;
        while (true) {
            System.out.println("\n-----Enter Circle-----");
            try {
                System.out.println("Enter radius:");
                radius = Double.parseDouble(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse radius to number.\nPlease enter agian!\n");
                continue;
            }
            System.out.println("Enter color:");
            color = scanner.nextLine();
            if (color.trim().isEmpty() || !onlyLetter.isOnlyLetters(color)) {
                System.out.println("\nError: Invalid color.\nPlease enter agian!\n");
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

        circle = new Circle(radius,color,filled);
    }

    public void display() {
        System.out.println(circle.toString());
    }

    public void getPerimeter() {
        System.out.printf("Perimeter: %.2f%n", circle.getPerimeter());
    }

    public void getArea() {
        System.out.printf("Area: %.2f%n", circle.getArea());
    }
}
