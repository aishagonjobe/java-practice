package ListInterface;

import java.util.ArrayList;

// Write a program to find common element within 2 arrays.
public class CompareArrays {

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

    }
}
