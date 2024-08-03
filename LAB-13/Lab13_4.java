public class Lab13_4 {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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
            temp = temp.next;
        } while (temp != head);
        System.out.println("Head");
    }

    // insertion
    public void insertAtFirst(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            n1.next = n1;
            head = n1;
            tail = n1;
        } else {
            n1.next = head;
            head = n1;
            tail.next = head;
        }
    }

    public void divide() {
        if (head == null || head.next == head) {
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = head;
        Node head2 = slow.next;

        slow.next = head1;

        if (fast.next == head) {
            fast.next = head2;
        } else {
            fast.next.next = head2;
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