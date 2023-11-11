import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept five strings separately
        String[] strings = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Concatenate the strings
        String result = concatenateStrings(strings);

        // Display the concatenated string
        System.out.println("Concatenated String: " + result);

        scanner.close();
    }

    // Method to concatenate an array of strings
    private static String concatenateStrings(String[] strings) {
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            result.append(str);
        }

        return result.toString();
    }
}
