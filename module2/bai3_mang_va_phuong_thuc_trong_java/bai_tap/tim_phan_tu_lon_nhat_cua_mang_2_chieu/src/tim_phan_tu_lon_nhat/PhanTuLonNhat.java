package tim_phan_tu_lon_nhat;
import java.util.Scanner;

public class PhanTuLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;

        // Enter 2 dimensional array
        int row = 0;
        int column = 0;
        try {
            System.out.print("Enter the row of 2 dimensional array: ");
            row = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the column of 2 dimensional array: ");
            column = Integer.parseInt(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("\nError: Could not parse row or column to number, exiting.");
            return;
        }

        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column;){
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
        System.out.println("Array just entered: ");
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }

        // Find max number in array
        int max = array[0][0];
        int x = 0;
        int y = 0;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]){
                    max = array[i][j];
                    x = j;
                    y = i;
                }
            }
        }
        System.out.println("Greatest value in array is " + max + " at column " + (x + 1)+ " and row " + (y + 1) + ".");

    }
}
