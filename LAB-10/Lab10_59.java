
import java.util.*;

class List {
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    Node first = null;

    public void insertNode(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }
        Node save = first;
        while (save.link != null) {
            save = save.link;

        }
        save.link = newNode;
    }

    public void display() {
        Node save = first;
        System.out.println("....final Ans......");
        while (save.link != null) {
            System.out.println(save.info);
            save = save.link;
        }
    }
}

public class Lab10_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List l1 = new List();
        while (true) {
            System.out.println("Enter 1 to insert a node");
            System.out.println("Enter 2 to display");
            System.out.println("Enter 3 to exit");
            int c = sc.nextInt();
            int data;

            if (c == 1) {
                System.out.println("Enter a insert node value");
                data = sc.nextInt();
                l1.insertNode(data);
            } else if (c == 2) {
                l1.display();
            } else if (c == 3) {
                System.out.println(l1.first.info);
                break;
            }
        }
        List l2 = new List();
        while (true) {
            System.out.println("Enter 1 to insert a first");
            System.out.println("Enter 2 to display");
            System.out.println("Enter 3 to exit");
            int c = sc.nextInt();
            int data;

            if (c == 1) {
                System.out.println("Enter a insert node value");
                data = sc.nextInt();
                l2.insertNode(data);
            } else if (c == 2) {
                l2.display();
            } else if (c == 3) {
                System.out.println(l2.first.info);
                break;
            }
        }
        while (l1.first != null && l2.first != null) {
            if (l1.first.info != l2.first.info) {
                System.out.println("Linked List is not same");
            } else {
                l1.first = l1.first.link;
                l2.first = l2.first.link;
                return;
            }
        }
        System.out.println("Linked List is same");
    }
}
