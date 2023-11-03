class Student_Detail {
    String name;
    int id;
    String college_name;

    public void display_details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College Name: " + college_name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student_Detail student1 = new Student_Detail();
        student1.name = "John Doe";
        student1.id = 1234;
        student1.college_name = "MIT";

        Student_Detail student2 = new Student_Detail();
        student2.name = "Jane Smith";
        student2.id = 5678;
        student2.college_name = "MIT";

        System.out.println("Student 1 Details:");
        student1.display_details();
        
        System.out.println("\nStudent 2 Details:");
        student2.display_details();
    }
}
