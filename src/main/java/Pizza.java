//        Calculate price of pizza based on the size
//        e.g if size of pizza is 15cm: 10 dollars
//        if size is 30cm 20 dollars double the price

// Usage of 'super' key word can be used to refer to immediate parent class variable
// it can be used to invoke a parent class variable, method, and constructor.

import java.util.Scanner;

public class Pizza extends Food{

    public static double calculatePrice (int size){
        if (size == 15){
            return 10.00;
        } else if (size == 30){
            return 20.00;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Food pizza = new Food();

        Scanner food = new Scanner(System.in);
        System.out.println("Enter pizza size (15 or 30): ");
        int pizzaSize = food.nextInt();  // Read user input

        pizza.setSize(pizzaSize);
        pizza.setPrice(calculatePrice(pizzaSize));
        System.out.println("Your pizza is " + "$" + pizza.getPrice());
        System.out.println(pizza.price);
    }
}
