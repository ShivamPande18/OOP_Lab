public class ArrayUtils {

    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Invalid indices. Please make sure indices are within the array bounds.");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Example usage
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(intArray));

        // Swap elements at index 1 and index 3
        swapElements(intArray, 1, 3);

        System.out.println("Array after swapping: " + Arrays.toString(intArray));
    }
}
