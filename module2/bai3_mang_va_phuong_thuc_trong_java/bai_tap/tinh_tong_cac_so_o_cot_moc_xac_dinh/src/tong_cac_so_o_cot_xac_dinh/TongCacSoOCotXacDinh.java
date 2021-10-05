package tong_cac_so_o_cot_xac_dinh;
import java.util.Scanner;

public class TongCacSoOCotXacDinh {
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

        // Caculater sum
        int columnToCaculaterSum = -1;
        while (true){
            try {
                System.out.print("\nEnter the column of caculater sum: ");
                columnToCaculaterSum = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse column to number.");
                continue;
            }
            if (columnToCaculaterSum < 1 || columnToCaculaterSum > column){
                System.out.println("\nError: The column should be from 1 to " + column +".");
            } else {
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == columnToCaculaterSum - 1){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of number in column " + columnToCaculaterSum + " is " + sum);
    }
}
