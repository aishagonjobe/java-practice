package ListInterface;

import java.util.ArrayList;

public class Average {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(9);
        numbers.add(10);

        int length = numbers.size();
        double  sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + numbers.get(i);
        }
        double average = sum/length;
        System.out.println("Average: " + average);
    }
}
