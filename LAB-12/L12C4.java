package L12C4;

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

    public void removeDuplicates() {
        if (first == null || first.link == null)
            return;
        Node currnt = first;
        while (currnt != null && currnt.link != null) {
            if (currnt.data == currnt.link.data)
                currnt.link = currnt.link.link;
            else
                currnt = currnt.link;
        }
    }
}

public class L12C4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        System.out.println("Original List:");
        list.display();

        list.removeDuplicates();
        System.out.println("List after removing duplicates:");
        list.display();
    }
}
