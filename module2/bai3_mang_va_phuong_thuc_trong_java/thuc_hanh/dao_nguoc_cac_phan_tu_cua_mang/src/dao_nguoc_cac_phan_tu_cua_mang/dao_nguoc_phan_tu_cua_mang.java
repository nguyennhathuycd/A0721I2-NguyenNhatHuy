package dao_nguoc_cac_phan_tu_cua_mang;
import java.util.Scanner;

public class dao_nguoc_phan_tu_cua_mang {
    public static void main(String[] args) {
        int size = 0;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            try {
                size = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("Error: Could not parse size to number, exiting.");
                return;
            };

            if (size > 20 || size < 1)
                System.out.println("Size does not exceed 20 or less than 1");
        } while (size > 20 || size < 1);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            try {
                array[i] = scanner.nextInt();
            } catch (Exception err) {
                System.out.println("Error: Could not parse Element " + (i + 1) + " to number, exiting.");
                return;
            };
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
