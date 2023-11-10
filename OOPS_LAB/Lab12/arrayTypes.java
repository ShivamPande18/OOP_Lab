public class GenericArrayPrinter {

    // Generic method to print an array of any type
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage with different types

        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Printing Integer Array:");
        printArray(intArray);

        // Double array
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        System.out.println("Printing Double Array:");
        printArray(doubleArray);

        // String array
        String[] stringArray = {"Hello", "World", "!"};
        System.out.println("Printing String Array:");
        printArray(stringArray);
    }
}
