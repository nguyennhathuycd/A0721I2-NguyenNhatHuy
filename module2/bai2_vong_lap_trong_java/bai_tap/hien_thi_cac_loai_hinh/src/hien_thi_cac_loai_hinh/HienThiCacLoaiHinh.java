package hien_thi_cac_loai_hinh;
import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        int height = 0;
        Scanner scanner = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception err){
                System.out.println("Error: Could not parse your choice to number, exiting.");
                return;
            }

            switch (choice) {
                case 1:
                    int length = 0;
                    int width = 0;
                    try {
                        System.out.print("Enter length: ");
                        length = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter width: ");
                        width = Integer.parseInt(scanner.nextLine());
                    } catch (Exception err) {
                        System.out.println("Error: Could not parse Length or Width to number, exiting.");
                        return;
                    }
                    if (length <= 0 || width <= 0){
                        System.out.println("Error: Length and Width should be greater than 0, exiting.");
                        return;
                    }

                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < width; i++){
                        for (int j = 0; j < length; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    height = 0;
                    try {
                        System.out.print("Enter height: ");
                        height = Integer.parseInt(scanner.nextLine());
                    } catch (Exception err) {
                        System.out.println("Error: Could not parse Height to number, exiting.");
                        return;
                    }
                    if (height <= 0) {
                        System.out.println("Error: Height should be greater than 0, exiting.");
                        return;
                    }
                    System.out.println("Draw the square triangle in botton-left");
                    for (int i = 1; i <= height; i++){
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("Draw the square triangle in botton-right");
                    for (int i = 1; i <= height; i++){
                        for (int k = 1; k <= height - i; k++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("Draw the square triangle in top-left");
                    for (int i = height; i >= 1; i--){
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("Draw the square triangle in top-right");
                    for (int i = height; i >= 1; i--){
                        for (int k = 1; k <= height - i; k++){
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    height = 0;
                    try {
                        System.out.print("Enter height: ");
                        height = Integer.parseInt(scanner.nextLine());
                    } catch (Exception err) {
                        System.out.println("Error: Could not parse Height to number, exiting.");
                        return;
                    }
                    if (height <= 0) {
                        System.out.println("Error: Height should be greater than 0, exiting.");
                        return;
                    }

                    System.out.println("Draw the isosceles triangle");
                    for (int i = 1; i <= height; i++){
                        for (int k = 1; k <= height - i; k++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
