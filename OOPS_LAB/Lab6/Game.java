// Base class
class Game {
    // Method in the base class
    void type() {
        System.out.println("Indoor & Outdoor Games");
    }
}

// Subclass 1
class Cricket extends Game {
    // Overriding the method in the subclass
    void type() {
        System.out.println("Cricket is an outdoor game");
    }
}

// Subclass 2
class Chess extends Game {
    // Overriding the method in the subclass
    void type() {
        System.out.println("Chess is an indoor game");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Game cricketGame = new Cricket();
        Game chessGame = new Chess();

        // Calling the overridden methods
        cricketGame.type(); // Dynamic method dispatch
        chessGame.type();   // Dynamic method dispatch
    }
}
