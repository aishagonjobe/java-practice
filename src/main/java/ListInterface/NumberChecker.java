package ListInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberChecker {

    public static String checkNumber (ArrayList<Integer> numbers, int userNumber) {
        String search = "Failed, " + userNumber + " was not found in the list.";
        for (int i = 0; i < numbers.size(); i++) {
            if (userNumber==numbers.get(i)){
                search = ("Success, " + userNumber + " was found in the list.");
            } else {
                continue;
            }
        }
        return search;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(9);
        numbers.add(10);

        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = number.nextInt();  // Read user input

        System.out.println(checkNumber(numbers, num));

        System.out.println(numbers);

    }
}
