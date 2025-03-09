import java.util.Scanner;

class Car1 {
    private int speed;
    private String color;

    void drive() {
        System.out.println("Mohit just Driving.....a car.");
    }

    public void setspeed(int speed){
        if(speed  < 0){
            System.out.println("Tera baap chala leta hai itni speed mein gaadi...!");
        }else{

            this.speed = speed;
        }

    }
    
    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }
    
    // Optional: Getter method for color
    public String getColor() {
        return color;
    }

}

public class mycar_private {
    public static void main(String[] args) {
        Scanner mohit = new Scanner(System.in);

        Car1 car = new Car1();
        System.out.println("Enter the speed of the car : ");
        int userspeed = mohit.nextInt();
        car.setspeed(userspeed);         // use the setter method to update the speed of car     

        System.out.println("Enter the color of the car : ");
        mohit.nextLine();
        String usercolor = mohit.nextLine();
        car.setColor(usercolor); // Use the setter method to update the private field
        
         // Display car details
         System.out.println("Car Details:");
         System.out.println("Mohit driving the car at the Speed of : " +userspeed+ " kmph");
         System.out.println("Mohit's car Color is : " +usercolor);
        car.drive();
        
        // Optional: Display the color using the getter method
        // System.out.println("Color: " + car.getColor());
    }
}
