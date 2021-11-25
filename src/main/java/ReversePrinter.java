import java.util.Scanner;

class ReversePrinter {

    public static void main(String[] args) {

        Scanner words = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = words.next();  // Read user input

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}