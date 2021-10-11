package hien_thi_20_so_nguyen_to_dau_tien;

public class HienThi20SoNguyenToDauTien {

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
        int count = 0;
        String result = "";
        for (int i = 2; count < 20; i++){
            if (isPrimeNumber(i)){
                result += i + ", ";
                count++;
            }
        }

        result = "First 20 prime numbers: " + result.substring(0, result.length() - 2) + ".";
        System.out.println(result);
    }
}
