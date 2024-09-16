public class Bus extends Vehicle {
    // Bus-specific attributes
    private int seats;
    private String routes;
    private String departureTime;
    private String arriveTime;

    // Constructor
    public Bus(String brand, String model, String color, String yearOfManufacture, int seats, String routes,
            String departureTime, String arriveTime) {
        super(brand, model, color, yearOfManufacture);
        this.seats = seats;
        this.routes = routes;
        this.departureTime = departureTime;
        this.arriveTime = arriveTime;
    }

    @Override
    public void start() {
        System.out.println("Xe buýt tuyến " + this.routes + "khởi hành");
    }

    @Override
    public void stop() {
        System.out.println("Xe buýt tuyến " + this.routes + "dừng lại");
    }

}

