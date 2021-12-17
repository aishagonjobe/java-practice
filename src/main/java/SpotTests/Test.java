package SpotTests;

import java.util.Scanner;

public class Test {
    public static void startTest(String newTest) {
        if (newTest.equals("y") || newTest.equals("Y")) {
            Scanner method = new Scanner(System.in);
            System.out.println("Enter the method you would like to run: ");
            String userMethod = method.next();  // Read user input
            System.out.println("Please wait, running test method... ");
            runTest(userMethod);
        } else {
            System.out.println("Thanks for running SpotTests.Test.java!");
        }
    }

    public static void runTest(String method) {
        Scanner testScanner = new Scanner(System.in);
        String nextTest;
        if (method.equals("printArray")) {
            printArray();
            System.out.println("Would you like to run another test method? Type Y or N: ");
            nextTest = testScanner.next();
            startTest(nextTest);

        } else if (method.equals("printMod")) {
            System.out.println("Enter first number: ");
            int num1 = testScanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = testScanner.nextInt();
            printMod(num1, num2);
            System.out.println("Would you like to run another test method? Type Y or N: ");
            nextTest = testScanner.next();
            startTest(nextTest);

        } else if (method.equals("checkPrime")) {
            System.out.println("Enter number to check prime: ");
            int num = testScanner.nextInt();
            System.out.println(checkPrime(num));
            System.out.println("Would you like to run another test method? Type Y or N: ");
            nextTest = testScanner.next();
            startTest(nextTest);

        } else if (method.equals("christmasTree")) {
            System.out.println("How tall is the tree? Enter a number: ");
            int height = testScanner.nextInt();
            christmasTree(height);
            System.out.println("Would you like to run another test method? Type Y or N: ");
            nextTest = testScanner.next();
            startTest(nextTest);

        } else {
            System.out.println("Invalid request, please try again.");
            nextTest = testScanner.next();
            runTest(nextTest);
        }
    }

    public static void printArray() {
        String[] array = new String[50];

        int[] array2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : array2) {
            System.out.print(num + ", ");
        }
    }

    public static void printMod(int num1, int num2) {
        System.out.println(num1 % num2);
    }


    public static boolean checkPrime(int number) {
        boolean check;
        if (number < 1) {
            check = false;
        } else if (number == 1 || number == 3 || number == 5 || number == 7) {
            check =  true;
        } else if (number > 2 && number % 2 != 0) {
            check =  true;
        } else if (number > 3 && number % 3 != 0) {
            check =  true;
        } else if (number > 5 && number % 5 != 0) {
            check =  true;
        } else if (number > 7 && number % 7 != 0) {
            check =  true;
        } else {
            check = false;
        }
        return check;
    }

    public static void christmasTree(int height) {
        String tree = "";
        String space = "";
        for (int i = 0; i < height; i++) {
            space = "    ";
            tree = "#";
            if (i == 0) {
                System.out.println(space + tree + space);
            } else if (i == 1){
                space = "   ";
                tree = "###";
                System.out.println(space + tree + space);
            }else if (i == 2){
                space = "  ";
                tree = "#####";
                System.out.println(space + tree + space);
            }else if (i == 3){
                space = " ";
                tree = "#######";
                System.out.println(space + tree + space);
            }else if (i == 4){
                space = "";
                tree = "#########";
                System.out.println(space + tree + space);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to SpotTests.Test.java. ");
        System.out.println("The functions in this class are 'printArray', 'printMod', 'checkPrime', or 'christmasTree'. ");
        Scanner start = new Scanner(System.in);
        System.out.println("Would you like to run a test? Enter 'Y' or 'N': ");
        String test = start.next();  // Read user input
        startTest(test);
    }
}
