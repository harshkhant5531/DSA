class LL {
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = info;
            this.link = null;

        }
    }

    public Node first = null;
    public Node last = null;
    public Node save = first;
    public Node pred = save;

    public void ins_first(int data) {
        Node newNode = new Node(data);
        newNode.info = data;
        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            first = newNode;
        }
    }

    public void ins_last(int data) {
        Node newNode = new Node(data);
        newNode.info = data;
        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            last = newNode;
        }

    }

    public void cir_delete(Node data) {
        if (first == null) {
            System.out.println("LinkedList Empty");
        }
        while (save != data && save != last) {
            pred = save;
            save = save.link;
        }
        if (save != data) {
            System.out.println("Node Not Found");
        }
        if (first == last) {
            first = null;
            last = null;
        } else if (data == first) {
            first = first.link;
            last.link = first;
        }

        else {
            pred.link = data.link;
            if (data == last) {
                last = pred;
            }
        }

    }

    public void display() {
        Node temp = first;
        while (temp != last) {
            System.out.println(temp.info);
            temp = temp.link;
        }
        System.out.println(last.info);

    }

}

public class LAB13A_71 {
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.ins_first(4);
        l1.ins_first(5);
        l1.ins_first(6);

        l1.display();
    }
}
