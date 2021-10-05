package uoc_so_chung_lon_nhat;
import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        try {
            System.out.print("Enter number 1: ");
            number1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter number 2: ");
            number2 = Integer.parseInt(scanner.nextLine());
        } catch (Exception err){
            System.out.println("Error: Could not parse to number, exiting.");
            return;
        }

        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        while (number1 != number2){
            if (number1 > number2){
                number1 -= number2;
            } else {
                number2 -= number1;
            }
        }

        System.out.println("Greatest common factor: " + number1);
    }
}
