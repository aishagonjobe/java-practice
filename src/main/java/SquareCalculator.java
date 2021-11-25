import java.util.Scanner;

public class SquareCalculator {
    public static int square(int number1) {
        int result = number1 * number1;
        return result;
    }

    public static void main(String args[]) {

        Scanner first = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1 = first.nextInt();  // Read user input

        System.out.println("The square is: " + square(number1));
    }
}
