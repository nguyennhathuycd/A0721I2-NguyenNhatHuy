package tong_duong_cheo_chinh;
import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;

        // Enter 2 dimensional array
        int size = 0;
        try {
            System.out.print("Enter the size of 2 dimensional array: ");
            size = Integer.parseInt(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("\nError: Could not parse size to number, exiting.");
            return;
        }

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size;){
                try {
                    System.out.print("Enter element " + (j + 1) + " of row " + (i + 1) + ": ");
                    temp = Integer.parseInt(scanner.nextLine());
                } catch (Exception err) {
                    System.out.println("\nError: Could not parse element " + (j + 1) + " to number.\nPlease enter element agian.\n");
                    continue;
                }
                array[i][j] = temp;
                j++;
            }
        }

        // Print array and caculater sum of the elements on the main diagonal
        int sum = 0;
        System.out.println("Array just entered: ");
        for(int i = 0; i < array.length; i++) {
            sum += array[i][i];
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nSum of the elements on the main diagonal is " + sum + ".");
    }
}
