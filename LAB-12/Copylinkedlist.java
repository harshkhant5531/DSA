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

    public void copyList(LinkedList sourceList) {
        if (sourceList.first == null) {
            System.out.println("Cannot copy an empty linked list");
        } else {
            this.first = null; // Clear the current list
            Node current = sourceList.first;
            while (current != null) {
                this.append(current.data); // Append data to the new list
                current = current.link;
            }
        }
    }
}

public class Copylinkedlist {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(0);
        l1.append(1);
        l1.append(2);
        l1.append(3);
        
        LinkedList l2 = new LinkedList();
        l2.copyList(l1);
        
        System.out.println("Copied List:");
        l2.printList();
    }
}
