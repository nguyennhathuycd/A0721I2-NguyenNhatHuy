package so_nguyen_to_be_hon_100;

public class SoNguyenToBeHon100 {
    public static void main(String[] args) {
        String result = "";
        for (int i = 2; i < 100; i++){
            boolean check = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                result += "" + i + ", ";
            }
        }

        result = "Những số nguyên tố < 100: " + result.substring(0, result.length() - 2) + ".";
        System.out.println(result);
    }
}
