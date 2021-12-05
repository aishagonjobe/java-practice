import java.util.Scanner;

public class NumberMatch {
    // in a list numbers, find the one that's equal to user input,
    // if no number is equal to user input you return no number found

    public static int[] numbers = {1, 14, 3, 0, 6, 7, 10, 4, 2, 20};

    public static String checkNumber (int userNumber) {
        String search = "Failed, " + userNumber + " was not found in the list.";
        for (int i = 0; i < numbers.length; i++) {
           if (userNumber==numbers[i]){
               search = ("Success, " + userNumber + " was found in the list.");
           } else {
               continue;
           }
        }
        return search;
    }

    public static void main (String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = number.nextInt();  // Read user input

        System.out.println(checkNumber(num));

    }
}
