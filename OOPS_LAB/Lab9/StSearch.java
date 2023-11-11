import java.util.Scanner;

class Student {
    private int registrationNumber;
    private String firstName;
    private String lastName;
    private String degree;

    public Student(int registrationNumber, String firstName, String lastName, String degree) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Degree: " + degree);
        System.out.println("--------------------------");
    }
}

public class StudentSearch {
    public static void main(String[] args) {
        // Create an array of 10 Student objects
        Student[] students = new Student[10];

        // Initialize students with some data
        students[0] = new Student(1, "John", "Doe", "Computer Science");
        students[1] = new Student(2, "Jane", "Smith", "Mathematics");
        // Add more students...

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Name or Last Name to search: ");
        String searchQuery = scanner.nextLine();

        boolean found = false;

        // Search for the student by First Name or Last Name
        for (Student student : students) {
            if (student != null && (student.getFirstName().equalsIgnoreCase(searchQuery)
                    || student.getLastName().equalsIgnoreCase(searchQuery))) {
                student.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student with " + searchQuery + " not found.");
        }

        scanner.close();
    }
}
