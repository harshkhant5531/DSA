import java.util.Stack;

class LinkedList {
    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    private Node first = null;

    public void append(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node current = first;
            while (current.link != null) {
                current = current.link;
            }
            current.link = newNode;
        }
    }

    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.link;
        }
        System.out.println("null");
    }

    // Using a Stack
    public void reverseLinkList() {
        if (first == null) {
            System.out.println("Cannot reverse empty linked list");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        Node current = first;

        // Push all elements onto the stack
        while (current != null) {
            stack.push(current.data);
            current = current.link;
        }

        // Pop elements from the stack and update the linked list
        current = first;
        while (current != null) {
            current.data = stack.pop();
            current = current.link;
        }
    }

    // Method 2: In-Place Reversal
    public void reverseLinkList2() {
        if (first == null) {
            System.out.println("Cannot reverse empty linked list");
            return;
        }

        Node current = first;
        Node prev = null;
        Node next;

        while (current != null) {
            next = current.link; 
            current.link = prev; 
            prev = current; 
            current = next; 
        }
        first = prev;
    }
}

public class L12A2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(1);
        list.append(2);
        list.append(3);

        System.out.println("Original List:");
        list.printList();

        list.reverseLinkList2(); 
        System.out.println("Reversed List:");
        list.printList();
    }
}
