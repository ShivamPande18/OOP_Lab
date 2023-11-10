import java.util.Scanner;

// Custom exception for handling even numbers
class EvenNumberException extends Exception {
    public EvenNumberException(String message) {
        super(message);
    }
}

public class EvenNumberExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                throw new EvenNumberException("EvenNumberException: Entered number is even.");
            }

            System.out.println("Entered number is: " + number);
        } catch (EvenNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
