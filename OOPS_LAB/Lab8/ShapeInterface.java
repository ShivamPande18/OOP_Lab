import java.util.Scanner;

// Interface for shapes
interface Shape {
    double calculateArea();
}

// Concrete class Square implementing Shape
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Concrete class Triangle implementing Shape
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class AreaCalculatorUsingInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the square
        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        Shape square = new Square(squareSide);

        // Input for the triangle
        System.out.print("Enter the base length of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        Shape triangle = new Triangle(triangleBase, triangleHeight);

        // Calculate and display the area of the square
        System.out.println("Area of the square: " + square.calculateArea());

        // Calculate and display the area of the triangle
        System.out.println("Area of the triangle: " + triangle.calculateArea());

        scanner.close();
    }
}
