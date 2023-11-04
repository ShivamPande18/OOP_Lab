abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(7.0);

        double rectangleArea = rectangle.calculateArea();
        double circleArea = circle.calculateArea();

        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the circle: " + circleArea);
    }
}
