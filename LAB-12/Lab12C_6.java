
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

    public void swapNodes() {
        if (first == null || first.link == null) {
            return;
        }

        Node newHead = first.link;
        Node prev = null;
        Node current = first;

        while (current != null && current.link != null) {
            Node nextNode = current.link;
            Node nextNextNode = nextNode.link;

            nextNode.link = current;
            current.link = nextNextNode;

            if (prev != null) {
                prev.link = nextNode;
            }

            prev = current;
            current = nextNextNode;
        }

        first = newHead;
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class Lab12C_6 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);

        System.out.println("Original Linked List:");
        list.printList();

        list.swapNodes();

        System.out.println("Linked List after swapping nodes:");
        list.printList();
    }
}