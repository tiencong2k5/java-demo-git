public class Vehicle {
    // Common attributes
    protected String brand;
    protected String model;
    protected String color;
    protected String yearOfManufacture;

    // Constructor
    public Vehicle(String brand, String model, String color, String yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    // Common methods
    public void start() {
        System.out.println("Xe bắt đầu chạy");
    }

    public void stop() {
        System.out.println("Dừng xe lại");
    }

    public void accelerate() {
        System.out.println("Tăng tốc");
    }

    public void decelerate() {
        System.out.println("Giảm tốc");
    }

    public void turnOnLights() {
        System.out.println("Bật đèn.");
    }
}
