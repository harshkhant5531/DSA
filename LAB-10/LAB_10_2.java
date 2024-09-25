import java.util.*;

class LL {
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }

    }

    public Node first = null;

    public void insertAtFirst(int data) {
        Node node1 = new Node(data);

        if (first == null) {
            first = node1;
            return;
        }
        node1.link = first;
        first = node1;
    }

    public void insertOrder(int data) {
        Node node1 = new Node(data);
        if (first == null) {
            node1.link = first;
            first = node1;
            return;
        }

        Node save = first;

        while (save.link != null && node1.info >= save.link.info) {
            save = save.link;
        }
        node1.link = save.link;
        save.link = node1;

    }

    public void insertAtLast(int data) {
        Node node1 = new Node(data);
        if (first == null) {
            node1.link = first;
            first = node1;
            return;
        }

        Node save = first;
        while (save.link != null) {
            System.out.println(save.info);
        }
        save.link = node1;
    }

    public void display() {
        Node save = first;
        if (first == null) {
            System.out.println("underflow");
        } else {
            while (save != null) {
                System.out.println(save.info);
                save = save.link;
            }
        }
    }

    public void delete(int data) {
        if (first == null) {
            System.out.println("empty");
            return;
        }
        Node save = first, pred = null;
        System.out.println("enter 1=>delete first node,enter 2=>delete ordered node,enter 3=>delete Last node");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            if (first.info == data) {
                first = save.link;
                return;
            } else if (n == 2) {
                while (save != null && save.info != n) {
                    pred = save;
                    save = save.link;
                }
                if (save == null) {
                    System.out.println("node not found");
                    return;
                }
                pred.link = save.link;
            } else if (n == 3) {
                while (true) {
                    pred = save;
                    save = save.link;
                    if (save.link == null) {
                        pred.link = null;
                    } else {
                        System.out.println();
                    }
                }
            }
        }
    }
}

public class LAB_10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL node1 = new LL();
        while (true) {
            System.out.println("1.insertAtFirst");
            System.out.println("2.insertOrder");
            System.out.println("3.insertAtLast");
            System.out.println("4.display");
            System.out.println("5.delete");
            System.out.println("6 for the exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter value :");
                    int x = sc.nextInt();
                    node1.insertAtFirst(x);
                    break;
                case 2:
                    System.out.println("enter value: ");
                    int y = sc.nextInt();
                    node1.insertOrder(y);
                    break;
                case 3:
                    System.out.println("enter value :");
                    int a = sc.nextInt();
                    node1.insertAtLast(a);
                    break;
                case 4:
                    node1.display();
                    break;
                case 5:
                    System.out.println("enter position: ");
                    int b = sc.nextInt();
                    node1.delete(b);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }
}