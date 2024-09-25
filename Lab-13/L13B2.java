class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L13B2 {
    Node head =null;

    void splitList() {
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
        slow.next = head;
        if (fast.next.next == head) {
            fast = fast.next;
        }
        fast.next = head2;
        printList(head1, slow);
        printList(head2, fast);
    }

    void printList(Node start, Node end) {
        Node temp = start;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != start);
        System.out.println();
    }

    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public static void main(String[] args) {
        L13B2 list = new L13B2();

        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.addEnd(4);
        list.addEnd(5);

        list.splitList();
    }
}
