package lop_hinh_chu_nhat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = 0;
        while (true) {
            System.out.print("Enter height: ");
            try{
                height = Double.parseDouble(scanner.nextLine());
            }
            catch(Exception ex) {
                System.out.println("\nError: Could not parse height to number. Please enter agian!\n");
                continue;
            }
            if (height < 1){
                System.out.println("\nError: Height can not less than 1. Please enter agian!\n");
            } else {
                break;
            }
        }

        double width = 0;
        while (true) {
            System.out.print("Enter width: ");
            try{
                width = Double.parseDouble(scanner.nextLine());
            }
            catch(Exception ex) {
                System.out.println("\nError: Could not parse width to number. Please enter agian!\n");
                continue;
            }
            if (width < 1){
                System.out.println("\nError: Width can not less than 1. Please enter agian!\n");
            } else {
                break;
            }
        }

        Rectangle rectangle = new Rectangle(height, width);
        rectangle.display();
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
