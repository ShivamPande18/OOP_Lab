import java.util.Scanner;

public class NegativeArraySizeExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            if (size < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative.");
            }

            // Attempt to create an array with the specified size
            int[] array = new int[size];
            System.out.println("Array created successfully with size: " + size);
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
