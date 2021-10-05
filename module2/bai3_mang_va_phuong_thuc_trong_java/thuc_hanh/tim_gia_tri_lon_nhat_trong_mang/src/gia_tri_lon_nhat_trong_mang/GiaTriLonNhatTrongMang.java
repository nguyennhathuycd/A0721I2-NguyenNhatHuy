package gia_tri_lon_nhat_trong_mang;
import java.util.Scanner;

public class GiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        int[] array;

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

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + " ,at position " + index);
    }
}
