import java.util.Scanner;

import java.util.Scanner;

public class Numbers {
    //    public int sum(int number1, int number2) {
    public static int sum(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static void main(String args[]) {
        // Numbers number = new Numbers();

        Scanner first = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = first.nextInt();  // Read user input

        Scanner second = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int number2 = second.nextInt();  // Read user input

//        System.out.println("The sum is: " + number.sum(number1, number2));
        System.out.println("The sum is: " + sum(number1, number2));
    }
}