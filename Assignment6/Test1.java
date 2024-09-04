// write a java program in java to accept a String in upper case and replace all the vowels present in the string with Asterisk(*) and display the new string.
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string in uppercase: ");
        String input = scanner.nextLine().toUpperCase();
        String replacedString = input.replaceAll("[AEIOU]", "*");
        System.out.println("New string: " + replacedString);
        scanner.close();
    }
}