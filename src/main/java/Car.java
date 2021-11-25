import java.util.Scanner;

public class Car {
    String color = "Red";
    String make = "Nissan";
    String year = "2021";

    public String brake() {
        return "The car is decelerating. ";
    }

    public String accelerate() {
        return "The car is accelerating. ";
    }

    public String carInfo() {
        return "The car is a " + color + " " + make + " " + year;
    }

    public static void main(String args[]) {
        Car car = new Car();
        //     System.out.println(car.carInfo());

        Scanner methods = new Scanner(System.in);
        System.out.print("Enter method: ");
        String carMethod = methods.next();  // Read user input
        String brake = "brake";


        if (carMethod.equals("brake")) {
            System.out.println(car.brake());
        } else if (carMethod.equals("accelerate")) {
            System.out.println(car.accelerate());
        } else {
            System.out.println("Invalid input");
        }
    }
}