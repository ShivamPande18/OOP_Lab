class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class GenericLinkedList<T> {
    private Node<T> head;

    public GenericLinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Using GenericLinkedList with Integer objects
        GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        System.out.println("Integer Linked List:");
        integerList.display();

        // Using GenericLinkedList with Double objects
        GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);

        System.out.println("Double Linked List:");
        doubleList.display();
    }
}
