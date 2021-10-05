package them_phan_tu_vao_mang;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        try {
            System.out.print("\nHow many elements do you want to enter? (N) ");
            n = Integer.parseInt(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("\nError: Could not parse N to number, exiting.");
            return;
        }

        int[] arr = new int[n + 5];
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
        try {
            System.out.print("\nEnter value need to insert into array: ");
            value = Integer.parseInt(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("\nError: Could not parse value to number, exiting.");
            return;
        }

        int position = 0;
        try {
            System.out.print("Enter position to insert in array: ");
            position = Integer.parseInt(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("\nError: Could not parse position to number, exiting.");
            return;
        }
        if (position < 0 || position > n + 1) {
            System.out.println("Error: Could not insert value into array.");
            return;
        }

        // Insert value into array
        for (int i = n; i > position - 1; i--){
            arr[i] = arr[i - 1];
        }
        arr[position - 1] = value;
        n += 1;

        // Array after insert
        System.out.print("The array after insert: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
