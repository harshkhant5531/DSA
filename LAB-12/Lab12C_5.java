class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    Node first;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void addGCDNodes() {
        Node current = first;
        while (current != null && current.link != null) {
            int gcd = findGCD(current.data, current.link.data);
            Node newNode = new Node(gcd);
            newNode.link = current.link;
            current.link = newNode;
            current = newNode.link;
        }
    }

    public int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.link;
            if (temp != null) {
                System.out.print(" --> ");
            }
        }
        System.out.println();
    }
}

public class Lab12C_5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(18);
        list.addNode(6);
        list.addNode(10);
        list.addNode(3);

        System.out.println("Original Linked List:");
        list.printList();

        list.addGCDNodes();

        System.out.println("Linked List after adding GCD nodes:");
        list.printList();
    }
}