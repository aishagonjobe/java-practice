//import java.util.Scanner;
//
//public class PizzaI implements FoodI {
//    //        Calculate price of pizza based on the size
////        e.g if size of pizza is 15cm: 10 dollars
////        if size is 30cm 20 dollars double the price
//
//// Usage of 'super' key word can be used to refer to immediate parent class variable
//// it can be used to invoke a parent class variable, method, and constructor.
//
//    public static double calculatePrice(int size) {
//        if (size == 15) {
//            return 10.00;
//        } else if (size == 30) {
//            return 20.00;
//        } else {
//            return 0;
//        }
//    }
//
//    public static void main(String[] args) {
//        FoodI pizza = new PizzaI();
//
//        Scanner food = new Scanner(System.in);
//        System.out.println("Enter pizza size (15 or 30): ");
//        int pizzaSize = food.nextInt();  // Read user input
//
//        pizza.setSize(pizzaSize);
//        pizza.setPrice(calculatePrice(pizza.getSize()));
//        System.out.println("Your pizza is " + "$" + pizza.getPrice());
//        System.out.println(pizza.price);
//    }
//
//    public void canEat() {
//        System.out.println("I am eating.");
//
//    }
//
//    public int getSize() {
//        return 0;
//    }
//
//    public void setSize(int size) {
//
//    }
//
//    public double getPrice() {
//        return 0;
//    }
//
//    public void setPrice(double price) {
//
//    }
//}