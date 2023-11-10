import java.util.ArrayList;
import java.util.List;

class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + '}';
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Using GenericStack with Student objects
        GenericStack<Student> studentStack = new GenericStack<>();
        studentStack.push(new Student("Alice"));
        studentStack.push(new Student("Bob"));
        studentStack.push(new Student("Charlie"));

        while (!studentStack.isEmpty()) {
            System.out.println("Popped Student: " + studentStack.pop());
        }

        // Using GenericStack with Employee objects
        GenericStack<Employee> employeeStack = new GenericStack<>();
        employeeStack.push(new Employee("John"));
        employeeStack.push(new Employee("Jane"));
        employeeStack.push(new Employee("Doe"));

        while (!employeeStack.isEmpty()) {
            System.out.println("Popped Employee: " + employeeStack.pop());
        }
    }
}
