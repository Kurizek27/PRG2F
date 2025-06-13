package Ukol1;

public class main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.move();
        car.move();
        car.color = "transparent";

        Vehicle car2 = new Car();
    }
}
