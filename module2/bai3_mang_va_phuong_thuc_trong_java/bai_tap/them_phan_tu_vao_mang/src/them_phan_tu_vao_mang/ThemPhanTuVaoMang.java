package them_phan_tu_vao_mang;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (true) {
            try {
                System.out.print("\nHow many elements do you want to enter? (N) ");
                n = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse N to number.\nPlease enter agian!");
                continue;
            }
            if (n <= 0) {
                System.out.println("\nError: Invalid N.\nPlease enter agian!");
                continue;
            }
            break;
        }

        int[] arr = new int[n];
        int temp = 0;
        for (int i = 0; i < n;){
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
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }

        int value = 0;
        while (true) {
            try {
                System.out.print("\nEnter value need to insert into array: ");
                value = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse value to number.\nPlease enter agian!");
                continue;
            }
            break;
        }

        int position = 0;
        while (true) {
            try {
                System.out.print("Enter position to insert in array: ");
                position = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse position to number.\nPlease enter agian!");
                continue;
            }
            if (position < 0 || position > n + 1) {
                System.out.println("\nError: Invalid position.\nPlease enter agian!");
                continue;
            }
            break;
        }

        int[] result = new int[n + 1];

        // Insert value into array
        for (int i = 0; i < position - 1; i++){
            result[i] = arr[i];
        }
        result[position - 1] = value;
        for (int i = position; i < result.length; i++){
            result[i] = arr[i - 1];
        }

        // Array after insert
        System.out.print("The array after insert: ");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
