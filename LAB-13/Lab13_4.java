public class Lab13_4 {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node head;
    public Node tail;

    public void printData(Node head) {
        Node temp = head;

        if (head == null) {
            System.out.println("Empty");
            return;
        }

        do {
            System.out.print(temp.data + " --> ");
            temp = temp.link;
        } while (temp != head);
        System.out.println("Head");
    }

    // insertion
    public void insertAtFirst(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            n1.link = n1;
            head = n1;
            tail = n1;
        } else {
            n1.link = head;
            head = n1;
            tail.link = head;
        }
    }

    public void divide() {
        if (head == null || head.link == head) {
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast.link != head && fast.link.link != head) {
            slow = slow.link;
            fast = fast.link.link;
        }

        Node head1 = head;
        Node head2 = slow.link;

        slow.link = head1;

        if (fast.link == head) {
            fast.link = head2;
        } else {
            fast.link.link = head2;
        }
        printData(head1);

        printData(head2);
    }

    public static void main(String[] args) {
        Lab13_4 l1 = new Lab13_4();

        l1.insertAtFirst(0);
        l1.insertAtFirst(4);
        l1.insertAtFirst(2);
        l1.insertAtFirst(3);
        l1.insertAtFirst(7);
        l1.insertAtFirst(5);
        l1.insertAtFirst(0);
        l1.insertAtFirst(89);
        l1.insertAtFirst(2);
        l1.insertAtFirst(33);
        l1.insertAtFirst(4);
        l1.insertAtFirst(5);

        l1.divide();

    }
}
