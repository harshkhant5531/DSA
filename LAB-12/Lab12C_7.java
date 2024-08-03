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

    public void removeDuplicates() {
        Node current = first;
        while (current != null && current.link != null) {
            if (current.data == current.link.data) {
                current.link = current.link.link;
            } else {
                current = current.link;
            }
        }
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

public class Lab12C_7 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(1);
        list.addNode(6);
        list.addNode(13);
        list.addNode(13);
        list.addNode(13);
        list.addNode(27);
        list.addNode(27);

        System.out.println("Original Linked List:");
        list.printList();

        list.removeDuplicates();

        System.out.println("Linked List after removing duplicates:");
        list.printList();
    }
}