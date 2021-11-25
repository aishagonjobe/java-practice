import java.util.Scanner;

public class Palindrome {
    // check if any word from user is a palindrome
    String word;

    Palindrome(String word) {
        this.word = word;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();

    }

    public boolean isPalindrome(String output, String reverse) {

        if (output.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Machine.");


        Scanner palindromeChecker = new Scanner(System.in);
        System.out.println("Please enter your word:");
        String userWord = palindromeChecker.nextLine();  // Read user input
        Palindrome str = new Palindrome(userWord);
//        str.stringReversed = reverse(userWord);
//        str.isPalindrome(stringReversed);


        System.out.println("The reverse of the given string is: " + str);
    }
}
