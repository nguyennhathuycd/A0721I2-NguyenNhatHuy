package tinh_tien_lai_cho_vay;
import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soTienGui = 0;
        double laiSuat = 0;
        int soThang = 0;

        try {
            System.out.print("Nhập số tiền gửi: ");
            soTienGui = Double.parseDouble(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("Error: Could not parse 'Số tiền gửi' to number, exiting.");
            return;
        }
        try {
            System.out.print("Nhập số lãi xuất (% năm): ");
            laiSuat = Float.parseFloat(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("Error: Could not parse 'Lãi xuất' to number, exiting.");
            return;
        }
        try {
            System.out.print("Nhập số tháng: ");
            soThang = Short.parseShort(scanner.nextLine());
        } catch (Exception err) {
            System.out.println("Error: Could not parse 'Số tháng' to number, exiting.");
            return;
        }

        double soTienLai = soTienGui * laiSuat / 100 / 12 * soThang;
        double tongSoTien = soTienGui + soTienLai;
        System.out.printf("Số tiền lãi có được sau " + soThang + " tháng là: %.0f", soTienLai);
        System.out.printf("\nTổng số tiền có được sau " + soThang + " tháng là: %.0f", tongSoTien);
    }
}
