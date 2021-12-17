package AreaInterface;

import java.util.Scanner;

public class AreaMain extends AreaMethods{


    public static void main(String[] args) {
        System.out.println("Welcome to the AreaInterface.Area Calculator.");
        System.out.println("Would you like to calculate a square, circle, or rectangle? " +
                "(please note shape is case-sensitive)");

        Scanner shape = new Scanner(System.in);
        System.out.println("Enter shape: ");
        String userShape = shape.nextLine();  // Read user input
        System.out.println("The area of the shape is " + areaCalculator(userShape));

    }

}
