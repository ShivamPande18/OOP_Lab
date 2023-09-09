import java.util.Scanner;

public class SeriesEval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x (in radians): ");
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms in the series: ");
        int n = scanner.nextInt();

        double result = evaluateSinSeries(x, n);

        System.out.println("Sin(" + x + ") = " + result);
    }

    public static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double evaluateSinSeries(double x, int n) {
        double result = 0;

        for (int i = 0; i < n; i++) {
            int power = 2 * i + 1;
            double term = Math.pow(-1, i) * Math.pow(x, power) / factorial(power);
            result += term;
        }

        return result;
    }
}
