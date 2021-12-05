public class NumbersArray {
    //   Use nested loops to find min and max of a number in an array
    public static int[] numbers = {1, 14, 3, 0, 6, 7, 10, 4, 2, -1};

    public static int max(int[] numbers) {
        int maxNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            maxNumber = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > maxNumber) {
                    maxNumber = numbers[j];
                } else {
                    continue;
                }
            }
        }
        return maxNumber;
    }

    public static int min(int[] numbers) {
        int minNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            minNumber = numbers[i];
            System.out.println("OUTER LOOP");
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("INNER LOOP");
                if (numbers[j] < minNumber) {
                    minNumber = numbers[j];
                } else {
                    continue;
                }
            }
        }
        return minNumber;
    }

        public static void main (String[] args){
            System.out.println("The maximum is: " + max(numbers) + " The minimum is: " + min(numbers));
        }
    }
