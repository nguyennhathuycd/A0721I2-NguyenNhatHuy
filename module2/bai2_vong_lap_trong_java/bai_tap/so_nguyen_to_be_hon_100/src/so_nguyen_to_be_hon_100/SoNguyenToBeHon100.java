package so_nguyen_to_be_hon_100;

public class SoNguyenToBeHon100 {

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String result = "";
        for (int i = 2; i < 100; i++){
            if (isPrimeNumber(i)){
                result += i + ", ";
            }
        }

        result = "Prime numbers less than 100: " + result.substring(0, result.length() - 2) + ".";
        System.out.println(result);
    }
}
