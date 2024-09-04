package Assignment6;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String longestWord = "";
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of longest word: " + maxLength);
        scanner.close();
    }
}