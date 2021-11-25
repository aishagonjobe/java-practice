public class SumLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        int average = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        average = sum / numbers.length;
        System.out.println("The sum of the numbers is:" + sum);
        System.out.println("The average of the numbers is:" + average);
    }
}
