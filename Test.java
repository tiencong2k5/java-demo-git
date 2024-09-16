import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Vui lòng nhập hai giá trị số nguyên");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (x <= 0 || y <= 0) {
                System.out.println("x và y là số nguyên dương");
                return;
            }

            int Chu_vi = 2 * (x + y);
            int Dien_tich = x * y;

            System.out.println("Chu vi của hình chữ nhật là: " + Chu_vi);
            System.out.println("Diện tích của hình chữ nhật là: " + Dien_tich);
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập các giá trị số nguyên");
        }
    }
}
