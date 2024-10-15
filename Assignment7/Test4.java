import java.util.Scanner;

public class Test4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = scanner.nextLine().toUpperCase();
        String[] words = sentence.split(" ");
        int count = 0;

        for (String word : words) {
            boolean hasConsecutiveLetters = false;
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i)+1 == word.charAt(i + 1)) {
                    hasConsecutiveLetters = true;
                    break;
                }
            }
            if (hasConsecutiveLetters) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Number of words containing consecutive letters: " + count);
        scanner.close();
    }
}