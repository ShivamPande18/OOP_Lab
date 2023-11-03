public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing
        Integer intObj = 10; // Autoboxing int to Integer
        Double doubleObj = 3.14; // Autoboxing double to Double
        Character charObj = 'A'; // Autoboxing char to Character
        Boolean boolObj = true; // Autoboxing boolean to Boolean

        // Unboxing
        int intVal = intObj; // Unboxing Integer to int
        double doubleVal = doubleObj; // Unboxing Double to double
        char charVal = charObj; // Unboxing Character to char
        boolean boolVal = boolObj; // Unboxing Boolean to boolean

        // Printing values
        System.out.println("Autoboxing and Unboxing Example:");
        System.out.println("Integer Object: " + intObj + ", int Value: " + intVal);
        System.out.println("Double Object: " + doubleObj + ", double Value: " + doubleVal);
        System.out.println("Character Object: " + charObj + ", char Value: " + charVal);
        System.out.println("Boolean Object: " + boolObj + ", boolean Value: " + boolVal);
    }
}
