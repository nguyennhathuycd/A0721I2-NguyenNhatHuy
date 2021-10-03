package hien_thi_loi_chao;
import java.util.Scanner;

public class HienThiLoiChao {

    boolean isOnlyLetters(String str){
        int len = str.length();
        for (int i = 0; i < len; i++){
            if (Character.isLetter(str.charAt(i)) == false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HienThiLoiChao h = new HienThiLoiChao();
        Scanner scanner = new Scanner(System.in);

        String name = "";
        while (true){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            if (name.trim().isEmpty() || !h.isOnlyLetters(name)){
                System.out.println("Please enter your name agian!");
            } else {
                System.out.println("Hello " + name);
                break;
            }
        }
    }
}
