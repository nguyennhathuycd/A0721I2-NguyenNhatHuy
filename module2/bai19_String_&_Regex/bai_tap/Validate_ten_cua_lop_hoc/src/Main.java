import java.util.Scanner;

public class Main {
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public static boolean checkClassName(String className) {
        return className.matches(CLASS_REGEX);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className;
        while (true) {
            System.out.println("Enter class name:");
            className = scanner.nextLine();
            if (checkClassName(className)) {
                System.out.println("\nClass name is valid.\nSuccessfully!\n");
                break;
            } else {
                System.out.println("\nError: Class name is invalid.\nTry agian!\n");
            }
        }
    }
}
