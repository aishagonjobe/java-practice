import java.util.Scanner;

public class Review {

    int number;

    public Review (int num){
        this.number = num;
    }

    public int getFactorial(int number){
        int factorial = 1;
        for (int i = 1; i<=number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main (String[] args){
//        Difference Between print & println
//        System.out.println("Line");
//        System.out.print("Line");
//        System.out.print("Line");

        System.out.println("Welcome to the Factorial Program.");

        Scanner factorial = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int userNumber = factorial.nextInt();  // Read user input
        Review num = new Review(userNumber);

        System.out.println("The result is: " + num.getFactorial(num.number));

    }
}
