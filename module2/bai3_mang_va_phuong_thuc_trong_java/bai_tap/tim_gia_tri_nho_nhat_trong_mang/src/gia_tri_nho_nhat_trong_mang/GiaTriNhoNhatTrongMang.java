package gia_tri_nho_nhat_trong_mang;
import java.util.Scanner;

public class GiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        try {
            System.out.print("\nHow many elements do you want to enter? (size) ");
            size = Integer.parseInt(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("\nError: Could not parse size to number, exiting.");
            return;
        }

        int[] arr = new int[size];
        int temp = 0;
        for (int i = 0; i < arr.length;){
            try {
                System.out.print("Enter element " + (i + 1) + ": ");
                temp = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse element " + (i + 1) + " to number.\nPlease enter element agian.\n");
                continue;
            }
            arr[i] = temp;
            i++;
        }

        System.out.print("The array just entered: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        int index = minValue(arr);
        System.out.println("\nThe smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
