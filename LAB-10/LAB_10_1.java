
public class LAB_10_1 {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtfirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }

        Node temp = first;
        first = newNode;
        newNode.link = temp;
    }

    public void insertAtlast(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }

        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = newNode;
    }

    public void printList() {
        if (first == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.link;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LAB_10_1 list = new LAB_10_1();
        list.insertAtfirst(30);
        list.insertAtfirst(20);
        list.insertAtfirst(10);

        list.printList();
    }
}