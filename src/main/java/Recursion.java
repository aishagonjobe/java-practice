public class Recursion {
    public static int sum(int num){
        if (num <= 10) {
            return num + sum(num + 1);
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int num = 1, result;
        result = sum(num);
        System.out.println("The sum of the numbers up to 10 is " + result);

    }
}
// public class Factorial {
//    public static int factorial( int n ) {
//        if (n != 0)  // termination condition
//            return n * factorial(n-1); // recursive call
//        else
//            return 1;
//    }
//
//    public static void main(String[] args) {
//        int number = 4, result;
//        result = factorial(number);
//        System.out.println(number + " factorial = " + result);
//    }
//}