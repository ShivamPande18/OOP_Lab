import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.print("Enter student's Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();

        int marks1 = 0, marks2 = 0, marks3 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter Marks in Subject 1: ");
                marks1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Marks in Subject 2: ");
                marks2 = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Marks in Subject 3: ");
                marks3 = Integer.parseInt(scanner.nextLine());

                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
            }
        }

        // Calculate percentage
        double totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300) * 100;

        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display student information
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
