public class ArrayExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Trying to access an index that is out of bounds
            int value = numbers[5];
            System.out.println("Value at index 5: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Please provide a valid index.");
        }
    }
}
