import java.util.Scanner;

public class Main {
    private static final String PHONE_NUMBER_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        while (true) {
            System.out.println("Enter phone number:");
            phoneNumber = scanner.nextLine();
            if (validatePhoneNumber(phoneNumber)) {
                System.out.println("\nPhone number is valid.\nSuccessfully!\n");
                break;
            } else {
                System.out.println("\nPhone number is invalid.\nTry agian!\n");
            }
        }
    }
}
