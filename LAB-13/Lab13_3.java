public class Lab13_3 {
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

    public Node head;

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

    void printList() {
        Node curr = head;
        System.out.print("Null <==> ");
        while (curr != null) {
            System.out.print(curr.data + " <==> ");
            curr = curr.rptr;
        }
        System.out.print("Null");
        System.out.println();
    }

    void deleteAlter() {
        Node temp = head;

        temp = temp.rptr;

        while (temp != null && temp.rptr != null) {
            temp.lptr.rptr = temp.rptr;
            temp.rptr.lptr = temp.lptr;
            temp = temp.rptr.rptr;
        }
        if (temp.rptr == null) {
            temp.lptr.rptr = null;
        }
    }

    public static void main(String[] args) {
        Lab13_3 l1 = new Lab13_3();

        l1.insertAtFirst(0);
        l1.insertAtFirst(1);
        l1.insertAtFirst(2);
        l1.insertAtFirst(3);
        l1.insertAtFirst(4);
        l1.insertAtFirst(5);
        l1.insertAtFirst(0);
        l1.insertAtFirst(1);
        l1.insertAtFirst(2);
        l1.insertAtFirst(3);
        l1.insertAtFirst(4);
        l1.insertAtFirst(5);

        l1.deleteAlter();
        l1.printList();
    }
}