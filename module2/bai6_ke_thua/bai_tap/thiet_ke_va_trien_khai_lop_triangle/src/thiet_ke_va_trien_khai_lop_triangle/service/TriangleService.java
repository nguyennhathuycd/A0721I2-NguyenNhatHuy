package thiet_ke_va_trien_khai_lop_triangle.service;

import thiet_ke_va_trien_khai_lop_triangle.model.Triangle;

import java.util.Scanner;

public class TriangleService {
    private Triangle triangle;
    private OnlyLetters onlyLetters = new OnlyLetters();

    public void add() {
        Scanner scanner = new Scanner(System.in);
        String color;
        boolean filled;
        double slide1;
        double slide2;
        double slide3;

        System.out.println("\n-----Triangle-----");
        while (true) {
            System.out.println("Enter color:");
            color = scanner.nextLine();
            if (!onlyLetters.isOnlyLetters(color)) {
                System.out.println("\nError: Invalid color.\nPlease enter agian\n");
                continue;
            }
            System.out.println("Is filled? (enter true or false):");
            String testFilled = scanner.nextLine();
            if (!testFilled.toLowerCase().equals("true") && !testFilled.toLowerCase().equals("false")) {
                System.out.println("\nError: Invalid filled.\nPlease enter agian!\n");
                continue;
            }
            filled = Boolean.parseBoolean(testFilled);

            try {
                System.out.println("Enter slide 1:");
                slide1 = Double.parseDouble(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could parse slide 1 to number.\nPlease enter agian!\n");
                continue;
            }
            if (slide1 <= 0) {
                System.out.println("\nError: Invalid slide 1.\nPlease enter agian!\n");
                continue;
            }

            try {
                System.out.println("Enter slide 2:");
                slide2 = Double.parseDouble(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could parse slide 2 to number.\nPlease enter agian!\n");
                continue;
            }
            if (slide2 <= 0) {
                System.out.println("\nError: Invalid slide 2.\nPlease enter agian!\n");
                continue;
            }

            try {
                System.out.println("Enter slide 3:");
                slide3 = Double.parseDouble(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could parse slide 3 to number.\nPlease enter agian!\n");
                continue;
            }
            if (slide3 <= 0) {
                System.out.println("\nError: Invalid slide 3.\nPlease enter agian!\n");
                continue;
            }
            break;
        }
        triangle = new Triangle(color,filled,slide1,slide2,slide3);
    }

    public void getPerimeter() {
        System.out.printf("\nPerimeter = %.2f", triangle.getPerimeter());
    }

    public void getArea() {
        System.out.printf("\nArea = %.2f", triangle.getArea());
    }

    public void display() {
        System.out.println(triangle.toString());
    }
}
