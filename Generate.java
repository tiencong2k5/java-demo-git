import java.util.Scanner;

class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        this.width = 1;
        this.height = 1;
        this.color = "White";
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public String getColor() {
        return this.color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return 2 * (this.width + this.height);
    }

    public String formatColor() {
        return this.color.substring(0, 1).toUpperCase() + this.color.substring(1).toLowerCase();
    }

}

public class Generate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        String color = scanner.next();

        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
        } else {

            Rectange rectange = new Rectange(width, height, color);
            double perimeter = rectange.findPerimeter();
            double area = rectange.findArea();
            String formattedColor = rectange.formatColor();
            System.out.printf("%.0f %.0f %s%n", perimeter, area, formattedColor);
        }
        scanner.close();
    }
}
