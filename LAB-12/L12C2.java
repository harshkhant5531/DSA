package L12C2;

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

    public void addGCDNodes() {
        if (first == null || first.link == null) {
            System.out.println("List is too short to add GCD nodes.");
            return;
        }

        Node current = first;
        while (current != null && current.link != null) {
            int gcdValue = gcd(current.data, current.link.data);
            Node gcdNode = new Node(gcdValue);
            gcdNode.link = current.link;
            current.link = gcdNode;
            current = gcdNode.link;
        }
    }

    private int gcd(int n1, int n2) {
        if (n2 == 0)
            return n1;
        else if (n2 > n1)
            return gcd(n2, n1);
        else
            return gcd(n2, n1 % n2);
    }
}

public class L12C2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(15);
        list.add(25);
        list.add(10);

        System.out.println("Original List:");
        list.display();

        list.addGCDNodes();
        System.out.println("List after adding GCD nodes:");
        list.display();
    }
}
