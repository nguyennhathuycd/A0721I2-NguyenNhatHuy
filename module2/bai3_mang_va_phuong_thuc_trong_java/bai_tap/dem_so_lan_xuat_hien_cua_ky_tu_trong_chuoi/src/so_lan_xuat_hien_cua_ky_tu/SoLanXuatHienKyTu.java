package so_lan_xuat_hien_cua_ky_tu;
import java.util.Scanner;

public class SoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        char character = ' ';
        while (true){
            System.out.print("Enter a character need to find: ");
            String temp = scanner.next();
            if (temp.length() > 1){
                System.out.println("Error...Please enter a character!");
            } else {
                character = temp.charAt(0);
                break;
            }
        }

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (string.charAt(i) == character) {
                count++;
            }
        }

        System.out.println("The number of occurrences of the character '" + character +
                "' in the string '" + string + "' is " + count + ".");
    }
}
