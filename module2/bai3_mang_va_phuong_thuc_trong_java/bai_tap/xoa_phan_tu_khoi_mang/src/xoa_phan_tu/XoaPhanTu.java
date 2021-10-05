package xoa_phan_tu;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++){
            double randomNum = Math.random() * 100 + 1;
            arr[i] = (int) randomNum;
        }

        System.out.print("Random array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        // Nhap phan tu X
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        try {
            System.out.print("\nEnter the element X need to be delete: ");
            x = Integer.parseInt(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("\nError: Could not parse the element X to number, exiting.");
            return;
        }

        int index_del = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                index_del = i;
                break;
            }
        }

        if (index_del != -1){
            for(int i = index_del; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;

            System.out.print("The array after delete the element " + x + ": ");
            for(int i = 0; i < arr.length; i++) {
                System.out.print("\t"+arr[i]);
            }
        } else {
            System.out.println("The element X not found in the array");
        }
    }
}
