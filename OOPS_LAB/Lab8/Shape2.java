import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    abstract double calculateArea();
}

// Concrete class Square extending Shape
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

// Concrete class Triangle extending Shape
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the square
        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);

        // Input for the triangle
        System.out.print("Enter the base length of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleBase, triangleHeight);

        // Calculate and display the area of the square
        System.out.println("Area of the square: " + square.calculateArea());

        // Calculate and display the area of the triangle
        System.out.println("Area of the triangle: " + triangle.calculateArea());

        scanner.close();
    }
}
