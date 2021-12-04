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

    public void isPalindrome(String reverse, String output) {
        if (reverse.equals(output)) {
            System.out.println("This string is a palindrome, the reverse of the given string is: " + reverse);
        } else {
            System.out.println("This string is not a palindrome, the reverse of the given string is: " + reverse);
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Machine.");


        Scanner palindromeChecker = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String userWord = palindromeChecker.nextLine();  // Read user input
        Palindrome str = new Palindrome(userWord);

        str.isPalindrome(str.reverse(str.word), str.word);

    }
}

// Access modifiers
// "public access modifier" - can be used anywhere
// "private access modifier" - can be used only in the current class
// "default access modifier" - can be used within the package/ can be used in the class using that package (not used commonly)
// "protected access modifier" - within the package and in the child class.
// "package" - group of functions available to a class using the package










