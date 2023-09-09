public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow. Cannot push element " + element);
        } else {
            top++;
            stackArray[top] = element;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow. Cannot pop element.");
            return -99999; 
        } else {
            int poppedElement = stackArray[top];
            top--;
            return poppedElement;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
    }
}
