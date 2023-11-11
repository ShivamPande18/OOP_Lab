// Base class
class Bike {
    // Member variable
    int speedlimit = 90;

    // Method in the base class
    void run() {
        System.out.println("Bike is running at a speed limit of " + speedlimit + " km/h");
    }
}

// Subclass
class Splendar extends Bike {
    // Member variable with a different value
    int speedlimit = 60;

    // Overriding the method in the subclass
    @Override
    void run() {
        System.out.println("Splendar is running at a speed limit of " + speedlimit + " km/h");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of the base class and subclass
        Bike bike = new Bike();
        Splendar splendar = new Splendar();

        // Demonstrating runtime polymorphism
        Bike polymorphicBike = splendar; // Upcasting

        // Calling the overridden method using the polymorphic reference
        polymorphicBike.run(); // This will call the overridden method in Splendar class
    }
}
