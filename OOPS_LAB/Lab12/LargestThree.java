public class GenericLargestFinder {

    // Generic method to find the largest of three Comparable objects
    public static <T extends Comparable<T>> T findLargest(T a, T b, T c) {
        T largest = a;

        if (b.compareTo(largest) > 0) {
            largest = b;
        }

        if (c.compareTo(largest) > 0) {
            largest = c;
        }

        return largest;
    }

    public static void main(String[] args) {
        // Example usage with different types

        // Integer
        Integer largestInteger = findLargest(5, 10, 3);
        System.out.println("Largest Integer: " + largestInteger);

        // Double
        Double largestDouble = findLargest(3.5, 1.2, 5.8);
        System.out.println("Largest Double: " + largestDouble);

        // String
        String largestString = findLargest("apple", "orange", "banana");
        System.out.println("Largest String: " + largestString);
    }
}
