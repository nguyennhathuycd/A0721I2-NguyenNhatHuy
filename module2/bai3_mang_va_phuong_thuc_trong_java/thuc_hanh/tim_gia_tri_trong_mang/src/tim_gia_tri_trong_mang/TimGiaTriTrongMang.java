package tim_gia_tri_trong_mang;
import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);

        String input_name = "";
        while (true){
            System.out.print("Enter a name’s student: ");
            input_name = scanner.nextLine();
            input_name = input_name.trim();
            if (!isOnlyLetters(input_name) || input_name.isEmpty()){
                System.out.println("Error: " + input_name + " is not a name.\nPlease enter name agian" );
            } else {
                break;
            }
        }

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + input_name + " in the list.");
        }
    }

    public static boolean isOnlyLetters(String str){
        int len = str.length();
        for (int i = 0; i < len; i++){
            if (Character.isLetter(str.charAt(i)) == false){
                return false;
            }
        }
        return true;
    }
}
