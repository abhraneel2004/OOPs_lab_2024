import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the city names and STD codes
        String[] cityNames = new String[10];
        int[] stdCodes = new int[10];

        // Input city names and STD codes
        System.out.println("Enter the names of 10 cities and their STD codes:");
        for (int i = 0; i < 10; i++) {
            System.out.print("City " + (i + 1) + ": ");
            cityNames[i] = scanner.nextLine();
            System.out.print("STD Code for " + cityNames[i] + ": ");
            stdCodes[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
        }

        // Search for a city
        System.out.print("Enter the name of the city to search: ");
        String searchCity = scanner.nextLine();

        // Search for the city in the list
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (cityNames[i].equalsIgnoreCase(searchCity)) {
                System.out.println("Search Successful");
                System.out.println("City: " + cityNames[i]);
                System.out.println("STD Code: " + stdCodes[i]);
                found = true;
                break;
            }
        }

        // Display message if city not found
        if (!found) {
            System.out.println("Search unsuccessful, no such city in the list");
        }
        scanner.close();
    }
}
