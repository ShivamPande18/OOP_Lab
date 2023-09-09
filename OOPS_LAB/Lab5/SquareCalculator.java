public class SquareCalculator {
    public static void main(String[] args) {
        int intResult = square(3);
        double doubleResult = square(0.2);

        System.out.println("Square of 3 is: " + intResult);
        System.out.println("Square of 0.2 is: " + doubleResult);
    }

    public static int square(int num) {
        return num * num;
    }

    public static double square(double num) {
        return num * num;
    }
}
