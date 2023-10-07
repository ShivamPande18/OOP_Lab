import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Enter a string: ");
        input = scanner.nextLine();

        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    checkPalindrome(input);
                    break;
                case 2:
                    sortAlphabetically(input);
                    break;
                case 3:
                    reverseString(input);
                    break;
                case 4:
                    concatenateStrings(input);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice (1-4).");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\nString Operations Menu");
        System.out.println("1. Check palindrome");
        System.out.println("2. Sort alphabetically");
        System.out.println("3. Reverse the string");
        System.out.println("4. Concatenate the original and reversed string");
        System.out.println("5. Exit");
    }

    public static void checkPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        if (cleanedStr.equals(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void sortAlphabetically(String str) {
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        String sortedStr = new String(chars);

        System.out.println("The string in alphabetical order: " + sortedStr);
    }

    public static void reverseString(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();

        System.out.println("The reversed string: " + reversedStr);
    }

    public static void concatenateStrings(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        String concatenatedStr = str + reversedStr;

        System.out.println("The concatenated string: " + concatenatedStr);
    }
}
