package kiem_tra_so_nguyen_to;
import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        while (true){
            System.out.print("Enter a number: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("Error: Could not parse number, exiting");
                return;
            };
            if (number < 2){
                System.out.println("Please enter a number >= 2.");
            } else {
                break;
            }
        }

        boolean check = true;
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                check = false;
                break;
            }
        }

        if (check){
            System.out.println("Result: "+ number + " is a prime");
        } else {
            System.out.println("Result: "+ number + " is not a prime");
        }
    }
}
