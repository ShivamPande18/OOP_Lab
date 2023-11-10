import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    // Method to print elements from a list using wildcard
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Using wildcard with different types

        // List of integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        System.out.println("Printing Integer List:");
        printList(integerList);

        // List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        System.out.println("Printing String List:");
        printList(stringList);

        // List of doubles
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);

        System.out.println("Printing Double List:");
        printList(doubleList);
    }
}
