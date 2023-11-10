// Custom exception for handling marks out of bounds
class MarkOutOfBoundsException extends Exception {
    public MarkOutOfBoundsException(String message) {
        super(message);
    }
}

// Class representing a student
class Student {
    private String name;
    private int mark;

    public Student(String name, int mark) throws MarkOutOfBoundsException {
        this.name = name;

        // Check if the mark is within bounds
        if (mark < 0 || mark > 100) {
            throw new MarkOutOfBoundsException("MarkOutOfBoundsException: Mark must be between 0 and 100.");
        }

        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
}

public class MarkOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        try {
            // Create a student with a mark
            Student student = new Student("John", 85);
            System.out.println("Student: " + student.getName() + ", Mark: " + student.getMark());

            // Try to create a student with an out-of-bounds mark (e.g., 110)
            Student invalidStudent = new Student("Invalid", 110);
            System.out.println("This will not be printed.");
        } catch (MarkOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }
    }
}
