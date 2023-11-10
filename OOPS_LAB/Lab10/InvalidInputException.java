import java.util.Scanner;

// Custom exception for handling invalid input
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

// Class for handling user input and performing sum
class InputHandler {
    private int sum;

    public InputHandler() {
        sum = 0;
    }

    // Method to take input and handle exceptions
    public void takeInput() {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("Enter a number (-1 to finish): ");
                String userInput = scanner.nextLine();

                if (userInput.equals("-1")) {
                    break;
                }

                try {
                    int number = parseAndValidateInput(userInput);
                    sum += number;
                } catch (InvalidInputException e) {
                    System.out.println("Invalid input. " + e.getMessage());
                }
            }

            System.out.println("Sum of the entered numbers: " + sum);
        } finally {
            scanner.close();
        }
    }

    // Helper method to parse and validate input
    private int parseAndValidateInput(String input) throws InvalidInputException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Please enter a valid integer.");
        }
    }
}

public class InputExceptionExample {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        inputHandler.takeInput();
    }
}
