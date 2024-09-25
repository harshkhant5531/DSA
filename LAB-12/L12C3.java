package L12C3;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    private Node first;

    public LinkedList() {
        this.first = null;
    }

    public void display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println();
    }

    public void add(int data) {
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

    public void swapNodes() {
        if (first == null || first.link == null) return;

        Node dummy = new Node(0);
        dummy.link = first;
        Node prev = dummy;
        Node current = first;

        while (current != null && current.link != null) {
            Node firstNode = current;
            Node secondNode = current.link;
            // Swap the nodes
            prev.link = secondNode;
            firstNode.link = secondNode.link;
            secondNode.link = firstNode;
            // Move to the next pair
            prev = firstNode;
            current = firstNode.link;
        }
        first = dummy.link;
    }
}

public class L12C3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println("Original List:");
        list.display();

        list.swapNodes();
        System.out.println("List after swapping consecutive nodes:");
        list.display();
    }
}
