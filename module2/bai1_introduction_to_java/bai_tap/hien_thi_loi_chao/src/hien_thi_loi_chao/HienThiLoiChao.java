package hien_thi_loi_chao;
import java.util.Scanner;

public class HienThiLoiChao {

    public static boolean isOnlyLetters(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (!Character.isLetter(arr[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        while (true){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            if (name.trim().isEmpty() || !isOnlyLetters(name)){
                System.out.println("Error: Invalid name.\nPlease enter your name agian!");
            } else {
                System.out.println("Hello " + name);
                break;
            }
        }
    }
}
