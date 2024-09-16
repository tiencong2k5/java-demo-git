public class Car extends Vehicle {
    // Car-specific attributes
    private String price;
    private String licensePlate;

    // Constructor
    public Car(String brand, String model, String color, String yearOfManufacture, String price, String licensePlate) {
        super(brand, model, color, yearOfManufacture);
        this.price = price;
        this.licensePlate = licensePlate;
    }

    @Override
    public void start() {
        System.out.println("Xe " + this.licensePlate + " đang khởi động");
    }

    @Override
    public void stop() {
        System.out.println("Xe" + this.licensePlate + "Dừng lại");
    }

}
