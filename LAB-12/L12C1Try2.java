public class L12C1Try2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List:");
        list.display();

        list.swapNodes(2);

        System.out.println("List after swapping 2nd node from start and end:");
        list.display();
    }
}

class Node {
    int data;
    Node link;

    public Node first = null;

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

    public void swapNodes(int k) {
        if (first == null || k <= 0) return;

        Node firstK = first;
        Node secondK = first;

        for (int i = 1; i < k; i++) {
            if (firstK == null) return; 
            firstK = firstK.link;
        }

        Node temp = firstK;
        while (temp.link != null) {
            temp = temp.link;
            secondK = secondK.link;
        }

        int tempData = firstK.data;
        firstK.data = secondK.data;
        secondK.data = tempData;
    }
}
