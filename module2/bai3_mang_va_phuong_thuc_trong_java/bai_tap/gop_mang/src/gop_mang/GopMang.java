package gop_mang;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;

        // Enter array 1
        int arrayLength1 = 0;
        try {
            System.out.print("How many elements do you want to enter in Array 1? ");
            arrayLength1 = Integer.parseInt(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("\nError: Could not to number, exiting.");
            return;
        }
        int[] array1 = new int[arrayLength1];
        for (int i = 0; i < arrayLength1;){
            try {
                System.out.print("Enter element " + (i + 1) + " of Array 1: ");
                temp = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse element " + (i + 1) + " to number.\nPlease enter element agian.\n");
                continue;
            }
            array1[i] = temp;
            i++;
        }
        System.out.print("Array 1: ");
        for(int i = 0; i < arrayLength1; i++) {
            System.out.print(array1[i] + "\t");
        }

        // Enter array 2
        int arrayLength2 = 0;
        try {
            System.out.print("\nHow many elements do you want to enter in Array 2? ");
            arrayLength2 = Integer.parseInt(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("\nError: Could not to number, exiting.");
            return;
        }
        int[] array2 = new int[arrayLength2];
        for (int i = 0; i < arrayLength2;){
            try {
                System.out.print("Enter element " + (i + 1) + " of Array 2: ");
                temp = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse element " + (i + 1) + " to number.\nPlease enter element agian.\n");
                continue;
            }
            array2[i] = temp;
            i++;
        }
        System.out.print("Array 2: ");
        for(int i = 0; i < arrayLength2; i++) {
            System.out.print(array2[i] + "\t");
        }

        // Array 3 = Array1 + Array 2
        int arrayLength3 = arrayLength1 + arrayLength2;
        int[] array3 = new int[arrayLength3];
        for (int i = 0; i < arrayLength3; i++){
            if (i < arrayLength1){
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - arrayLength1];
            }
        }
        System.out.print("\nArray after merge from Array 1 and Array 2: ");
        for(int i = 0; i < arrayLength3; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
