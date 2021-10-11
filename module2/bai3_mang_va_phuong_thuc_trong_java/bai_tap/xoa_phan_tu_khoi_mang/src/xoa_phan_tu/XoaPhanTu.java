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
        while (true) {
            try {
                System.out.print("\nEnter the element X need to be delete: ");
                x = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse the element X to number.\nPlease enter agian!");
                continue;
            }
            break;
        }

        int indexDel = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                indexDel = i;
                break;
            }
        }

        int[] result = new int[arr.length - 1];
        if (indexDel != -1){
            for(int i = 0; i < indexDel; i++) {
                result[i] = arr[i];
            }

            for(int i = indexDel; i < result.length; i++) {
                result[i] = arr[i + 1];
            }

            System.out.print("The array after delete the element " + x + ": ");
            for(int i = 0; i < result.length; i++) {
                System.out.print("\t"+result[i]);
            }
        } else {
            System.out.println("The element " + x + " not found in the array");
        }
    }
}
