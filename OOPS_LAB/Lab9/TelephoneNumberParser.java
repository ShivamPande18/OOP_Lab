import java.util.Scanner;

public class TelephoneNumberParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a telephone number in the specified format
        System.out.print("Enter a telephone number (in the form (555) 555-5555): ");
        String phoneNumber = scanner.nextLine();

        // Use String methods to extract area code, first three digits, and last four digits
        String areaCode = extractAreaCode(phoneNumber);
        String firstThreeDigits = extractFirstThreeDigits(phoneNumber);
        String lastFourDigits = extractLastFourDigits(phoneNumber);

        // Display the extracted information
        System.out.println("Area Code: " + areaCode);
        System.out.println("First Three Digits: " + firstThreeDigits);
        System.out.println("Last Four Digits: " + lastFourDigits);

        scanner.close();
    }

    // Method to extract the area code from a telephone number
    private static String extractAreaCode(String phoneNumber) {
        return phoneNumber.substring(1, 4); // Extract characters from index 1 to 3 (exclusive)
    }

    // Method to extract the first three digits from a telephone number
    private static String extractFirstThreeDigits(String phoneNumber) {
        return phoneNumber.substring(6, 9); // Extract characters from index 6 to 8 (exclusive)
    }

    // Method to extract the last four digits from a telephone number
    private static String extractLastFourDigits(String phoneNumber) {
        return phoneNumber.substring(10); // Extract characters from index 10 to the end
    }
}
