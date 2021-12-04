public class NumbersArray {
//   Use nested loops to find min and max of a number in an array
    public static int[] numbers = {1, 14, 3, 0, 6, 7, 10, 4, 2};

    public static int max(int[] numbers) {
        int maxNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                if (numbers[i] > numbers[i + 1]) {
                    maxNumber = numbers[i];
                }
            } else {
                if (numbers[i] > numbers[i -1]) {
                    maxNumber = numbers[i];
                }else{
                maxNumber = numbers[i-1];
                }
            }
        }
        return maxNumber;
    }

    public static int min(int[] numbers) {
        int minNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length-1) {
                if (numbers[i] < numbers[i + 1]) {
                    minNumber = numbers[i];
                }else{
                    minNumber = numbers[i+1];
                }
            } else {
                if (numbers[i] < numbers[i - 1]) {
                    minNumber = numbers[i];
                }else{
                    minNumber = numbers[i-1];
                }
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {
        System.out.println("The maximum is: " + max(numbers) + " The minimum is: " + min(numbers));
    }
}
