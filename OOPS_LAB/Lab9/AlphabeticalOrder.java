import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of strings
        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();

        // Consume the newline character after reading the integer
        scanner.nextLine();

        // Accept an array of strings
        String[] strings = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Choose the sorting order
        System.out.print("Enter sorting order (asc or desc): ");
        String sortOrder = scanner.nextLine();

        // Sort the array in alphabetical order
        if ("asc".equalsIgnoreCase(sortOrder)) {
            Arrays.sort(strings);
        } else if ("desc".equalsIgnoreCase(sortOrder)) {
            Arrays.sort(strings, (a, b) -> b.compareTo(a));
        } else {
            System.out.println("Invalid sorting order. Please enter 'asc' or 'desc'.");
            return;
        }

        // Display the sorted array
        System.out.println("Sorted Strings:");

        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
