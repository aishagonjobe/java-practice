import java.util.Objects;
import java.util.Scanner;

// Count the number of vowels in the string
public class Vowels {

    public static int checkVowels (String userWord) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < userWord.length(); i++) {
            char userLetter = userWord.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (userLetter == vowels[j]) {
                    count++;
                }else{
                    continue;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = string.nextLine();  // Read user input

        System.out.println("The number of vowels in this word is: " + checkVowels(word));
    }
}
