import java.util.Scanner;

public class SquareRoot {

    public static void main(String args[]) {

        Scanner first = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1 = first.nextInt();  // Read user input

        System.out.println("The square root is: " + Math.sqrt(number1));
    }
}