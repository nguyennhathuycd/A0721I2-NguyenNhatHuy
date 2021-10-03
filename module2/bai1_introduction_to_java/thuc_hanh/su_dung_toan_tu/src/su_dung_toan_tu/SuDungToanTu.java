package su_dung_toan_tu;
import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài hình chữ nhật:");
        float chieuDai = Float.parseFloat(sc.nextLine());

        System.out.println("Nhập chiều rộng hình chữ nhật:");
        float chieuRong = Float.parseFloat(sc.nextLine());

        if (chieuDai <= 0 || chieuRong <= 0){
            System.out.println("Vui lòng nhập chiều dài và chiều rộng lớn hơn 0");
        } else {
            double dienTich = chieuDai * chieuRong;
            System.out.println("Diện tích hình chữ nhật là: " + dienTich);
        }
    }
}
