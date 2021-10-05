package hien_thi_20_so_nguyen_to_dau_tien;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        String result = "";
        for (int i = 2; count < 20; i++){
            boolean check = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                result += "" + i + ", ";
                count++;
            }
        }

        result = "20 số nguyên tố đầu tiên: " + result.substring(0, result.length() - 2) + ".";
        System.out.println(result);
    }
}
