public class LAB_10_3 {
    public class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;
    public int nodes = 0;

    public void insertAtfirst(int data) {
        Node newNode = new Node(data);
        nodes++;
        if (first == null) {
            first = newNode;
            return;
        }

        Node temp = first;
        first = newNode;
        first.link = temp;
    }

    public void insertAtlast(int num) {
        Node newNode = new Node(num);
        nodes++;
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

    public void deleteAtFirst() {
        nodes--;
        if (first == null) {
            System.out.println("Link is empty...");
            return;
        }
        first = first.link;
    }

    public void deleteAtLast() {
        Node secondLast = first;
        Node lastNode = first.link;
        nodes--;
        if (first == null) {
            System.out.println("List is empty");
            return;
        }

        if (first.link == null) {
            first = null;
            return;
        }

        while (lastNode.link != null) {
            lastNode = lastNode.link;
            secondLast = secondLast.link;
        }

        secondLast.link = null;
    }

    public void PrintList() {
        if (first == null) {
            System.out.println("List is empty: ");
            return;
        }
        Node curNode = first;
        while (curNode != null) {
            System.out.print(curNode.info + "->");
            curNode = curNode.link;
        }
        System.out.println("NULL");
        System.out.println(nodes);
    }

    public static void main(String[] args) {
        P58 list = new P58();
        list.insertAtfirst(30);
        list.insertAtfirst(20);
        list.insertAtfirst(40);
        list.insertAtfirst(50);
        list.insertAtfirst(60);

        list.PrintList();
    }
}