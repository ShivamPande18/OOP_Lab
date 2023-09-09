public class ArrayOperations {
    private int[] array;

    public ArrayOperations() {
        array = new int[10];
    }

    public void inputValues(int[] values) {
        if (values.length == 10) {
            System.arraycopy(values, 0, array, 0, 10);
        } else {
            System.out.println("Error: Input array must be of size 10.");
        }
    }

    public void displayValues() {
        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public int findLargestValue() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    public void sortAscending() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayOperations arrayOps = new ArrayOperations();
        int[] values = {5, 10, 3, 8, 2, 7, 1, 6, 9, 4};

        arrayOps.inputValues(values);
        arrayOps.displayValues();
        System.out.println("Largest value: " + arrayOps.findLargestValue());
        System.out.println("Average: " + arrayOps.calculateAverage());

        arrayOps.sortAscending();
        arrayOps.displayValues();
    }
}
