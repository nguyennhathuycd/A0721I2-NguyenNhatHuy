package ung_dung_doc_so_thanh_chu;
import java.util.Scanner;

public class DocSoThanhChu {
    String readNumberLessThan10(int number) {
        String result = "";
        switch (number){
            case 0: result = ""; break;
            case 1: result = "one"; break;
            case 2: result = "two"; break;
            case 3: result = "three"; break;
            case 4: result = "four"; break;
            case 5: result = "five"; break;
            case 6: result = "six"; break;
            case 7: result = "seven"; break;
            case 8: result = "eight"; break;
            case 9: result = "nine"; break;
            default:
        }
        return result;
    }

    String readNumberLessThan20(int number) {
        String result = "";
        switch (number){
            case 10: result = "ten"; break;
            case 11: result = "eleven"; break;
            case 12: result = "twelve"; break;
            case 13: result = "thirteen"; break;
            case 14: result = "fourteen"; break;
            case 15: result = "fifteen"; break;
            case 16: result = "sixteen"; break;
            case 17: result = "seventeen"; break;
            case 18: result = "eighteen"; break;
            case 19: result = "nineteen"; break;
            default:
        }
        return result;
    }

    String readNumberLessThan100(int number) {
        String result = "";
        switch (number){
            case 0: result = ""; break;
            case 1: result = ""; break;
            case 2: result = "twenty"; break;
            case 3: result = "thirty"; break;
            case 4: result = "forty"; break;
            case 5: result = "fifty"; break;
            case 6: result = "sixty"; break;
            case 7: result = "seventy"; break;
            case 8: result = "eighty"; break;
            case 9: result = "ninety"; break;
            default:
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true){
            System.out.print("Enter your number: ");
            try{
                number = Integer.parseInt(scanner.nextLine());
            }
            catch(Exception ex) {
                System.out.println("Error: Could not parse number, exiting");
                return;
            }

            if (number < 0 || number > 999){
                System.out.println("Please enter your number agian!");
            } else {
                break;
            }
        }

        DocSoThanhChu d = new DocSoThanhChu();
        String result = "";
        if (number == 0) {
            result = "zero";
        } else if (number < 10) {
            result = d.readNumberLessThan10(number);
        } else if (number < 20) {
            result = d.readNumberLessThan20(number);
        } else if (number < 100) {
            result = d.readNumberLessThan100(number / 10) + " " + d.readNumberLessThan10(number % 10);
        } else if (number < 1000) {
            result = d.readNumberLessThan10(number / 100) + " hundred " + d.readNumberLessThan100(number % 100 / 10);
            if (number % 100 / 10 == 1){
                result += " " + d.readNumberLessThan20(number % 100);
            } else {
                result += " " + d.readNumberLessThan10(number % 10);
            }
        } else {
            result = "The program can not read your number";
        }

        result = result.trim();
        System.out.println("Read number: " + result);
    }
}
