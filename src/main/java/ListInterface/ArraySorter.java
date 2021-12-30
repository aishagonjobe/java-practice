package ListInterface;

// Write out program to sort out an array list of integers from biggest to smallest
// Write out program to sort out an array list in reverse order.

import java.util.ArrayList;

public class ArraySorter {

    public static ArrayList<Integer> numberSort(ArrayList<Integer> numbers) {
        int maxNumber = 0;
        System.out.println(numbers);
        ArrayList<Integer> numbersSorted = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            maxNumber = numbers.get(i);
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j) > maxNumber) {
                    maxNumber = numbers.get(j);
                    numbers.remove(maxNumber);
                } else {
                    continue;
                }
            }
            numbersSorted.add(maxNumber);
        }
        return numbersSorted;
    }

    public static int numberReverse(ArrayList<Integer> numbers) {
        int maxNumber = 0;

        for (int i = 0; i < numbers.size(); i++) {
            maxNumber = numbers.get(i);
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j) > maxNumber) {
                    maxNumber = numbers.get(j);
                } else {
                    continue;
                }
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(4);
        numbers.add(8);
        numbers.add(9);
        numbers.add(11);

//        Scanner number = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = number.nextInt();  // Read user input
//
//        System.out.println(checkNumber(numbers, num));

        System.out.println(numberSort(numbers));
    }
}