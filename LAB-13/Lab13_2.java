public class Lab13_2 {
    class Node {
        int data;
        Node lptr;
        Node rptr;

        public Node(int data) {
            this.data = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    public Node head = null;

    // ADD first
    public void insertAtFirst(int data) {

        Node n1 = new Node(data);

        n1.rptr = head;
        n1.lptr = null;

        if (head != null) {
            head.lptr = n1;
        }

        head = n1;
    }

    // ADD at position
    public void insertAtPosition(int index, int data) {
        Node n = new Node(data);

        if (index == 0) {
            insertAtFirst(data);
        }

        Node temp = head;

        for (int i = 2; i < index && temp != null; i++) {
            temp = temp.rptr;
        }

        if (temp == null || temp.rptr == null) {
            insertAtLast(data);
        }

        n.rptr = temp.rptr;
        n.lptr = temp;
        temp.rptr.lptr = n;
        temp.rptr = n;

    }

    // ADD at last
    public void insertAtLast(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;

        while (temp.rptr != null) {
            temp = temp.rptr;
        }

        temp.rptr = n;
        n.lptr = temp.rptr;
        n.rptr = null;
    }

    // DELETE first
    public void deleteFromFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.rptr == null) {
            head = null;
            return;
        } else {
            head.rptr.lptr = null;
            head = head.rptr;
        }
    }

    // DELETE form index
    public void deleteIndex(int index) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        if (index == 0) {
            deleteFromFirst();
            return;
        }

        Node temp = head;

        for (int i = 1; i <= index; i++) {
            temp = temp.rptr;
        }

        temp.lptr.rptr = temp.rptr;
        temp.rptr.lptr = temp.lptr;

    }

    // DELETE last
    public void deleteFromLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;

        while (temp.rptr.rptr != null) {
            temp = temp.rptr;
        }
        temp.rptr = null;
    }

    // PRINT list
    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.rptr;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab13_2 dll = new Lab13_2();

        dll.insertAtFirst(0);
        dll.insertAtFirst(1);
        dll.insertAtFirst(2);
        dll.insertAtFirst(3);
        dll.insertAtFirst(4);
        dll.insertAtFirst(5);
        dll.insertAtFirst(0);
        dll.insertAtFirst(1);
        dll.insertAtFirst(2);
        dll.insertAtFirst(3);
        dll.insertAtFirst(4);
        dll.insertAtFirst(5);

        // dll.insertAtPosition(2, 69);

        dll.deleteFromLast();
        dll.deleteFromLast();

        dll.insertAtLast(1);

        // dll.deleteFromFirst();
        // dll.deleteFromFirst();
        // dll.deleteFromFirst();
        // dll.deleteFromFirst();
        // dll.deleteFromFirst();
        // dll.deleteFromFirst();

        dll.deleteIndex(5);

        dll.printList();

    }
}