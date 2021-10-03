package ung_dung_chuyen_doi_tien_te;
import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        double USD = 0;

        while (true){
            System.out.print("Enter your monney(USD): ");
            try{
                USD = Integer.parseInt(scanner.nextLine());
            }
            catch(Exception ex) {
                System.out.println("Error: Could not parse money to number, exiting");
                return;
            }
            if (USD <= 0){
                System.out.println("Please enter your monney agian!");
            } else {
                break;
            }
        }

        double VND = USD * 23000;
        System.out.println("USD to VND: " + VND + " VND");
    }
}
