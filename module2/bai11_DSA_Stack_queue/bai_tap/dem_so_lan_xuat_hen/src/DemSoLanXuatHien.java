import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 chuoi bat ky: ");
        String chuoi = scanner.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();
        int[] tanSuat = new int[26];
        // tanSuat[0] số lần xuất hiện của chữ a
        // tanSuat[1] số lần xuất hiện của chữ b
        // ...
        // tanSuat[25] số lần xuất hiện của chữ z
        char[] kytu = chuoi.toCharArray();
        int length = kytu.length;
        for (int i = 0; i < length; i++) {
            char ch = kytu[i];
            // Kiểm tra xem ch có phải chữ in hoa A-Z,
            if (ch >= 65 && ch <= 90) {
                // Chuyển thành chữ in thường dựa vào bảng mã ascii
                ch = (char) (ch + 32);
            }

            // kiểm tra char có phải là chữ thường hay không
            if (ch >= 97 && ch <= 122) {
                if (map.get(ch) == null) {
                    map.put(ch, 1);
                } else {
                    int newValue = map.get(ch) + 1;
                    map.put(ch, newValue);
                }
            }
        }

        System.out.println("Dem so lan xuat hien trong chuoi:");
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println("Ky tu " + entry.getKey() + " xuat hien " + entry.getValue() + " lan.");
        }
    }
}
