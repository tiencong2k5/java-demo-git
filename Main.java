import java.util.Scanner;
import java.util.Locale;

class Point {
    private double x;
    private double y;

    // Constructor mặc định
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor có tham số
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức lấy tọa độ X
    public double getX() {
        return this.x;
    }

    // Phương thức lấy tọa độ Y
    public double getY() {
        return this.y;
    }

    // Phương thức tính khoảng cách giữa hai điểm
    public double distance(Point secondPoint) {
        double dx = this.x - secondPoint.getX();
        double dy = this.y - secondPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Phương thức static tính khoảng cách giữa hai điểm
    public static double distance(Point p1, Point p2) {
        return p1.distance(p2);
    }

    // Phương thức chuyển đối tượng thành chuỗi
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Đọc vào số bộ test
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            // Nhập tọa độ của điểm A
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();

            // Nhập tọa độ của điểm B
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            // Tạo hai đối tượng Point
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);

            // Tính và in khoảng cách với 4 chữ số thập phân
            System.out.printf("%.4f%n", Point.distance(p1, p2));
        }

        scanner.close();
    }
}
