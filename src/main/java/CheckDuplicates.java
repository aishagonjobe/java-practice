class CheckDuplicates {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 8, 9};

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                if (numbers[i] == numbers[i + 1]) {
                    continue;
                }
                System.out.println(numbers[i]);
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
}