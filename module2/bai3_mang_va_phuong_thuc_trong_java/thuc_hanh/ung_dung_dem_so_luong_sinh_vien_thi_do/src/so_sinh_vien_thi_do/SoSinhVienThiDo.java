package so_sinh_vien_thi_do;
import java.util.Scanner;

public class SoSinhVienThiDo {
    public static void main(String[] args) {
        int size = 0;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter a size: ");
                size = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("Error: Could not parse size to number.\nPlease entered a size again!");
                continue;
            }

            if (size > 30 || size < 1)
                System.out.println("Size should not exceed 30 or less than 1.");
        } while (size > 30 || size < 1);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            try {
                System.out.print("Enter a mark for student " + (i + 1) + ": ");
                array[i] = Integer.parseInt(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("Please enter mark of student from 0 to 10.");
                continue;
            }
            if (array[i] < 0 || array[i] > 10){
                System.out.println("Please enter mark of student from 0 to 10.");
                continue;
            }
            i++;
        }
        int count = 0;
        System.out.print("List of mark:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 5 && array[j] <= 10)
                count++;
            System.out.print("\t" + array[j]);
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}
