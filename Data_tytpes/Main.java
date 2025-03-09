class Car {
    int speed;
    String color;

    void drive() {
        System.out.println("Mohit is Driving......the car while drinking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 110;
        car.color = "Red";
        car.drive();
    }
}
