import java.util.Scanner;

public class Rectengle {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x <= 0 || y <= 0) {
                System.out.println(0);
                return;
            }

            int Chu_vi = 2 * (x + y);
            int Dien_tich = x * y;

            System.out.print(Chu_vi + " ");
            System.out.println(Dien_tich);
        } catch (NumberFormatException e) {
            System.out.println(0);
        }
    }
}
