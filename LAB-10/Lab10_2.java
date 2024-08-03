import java.util.*;

class linkedlist {
    Scanner sc = new Scanner(System.in);

    class Node {

        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertatfirst(int data) {
        Node newnode = new Node(data);

        if (first == null) {
            first = newnode;
            return;
        }
        Node save = first;
        first = newnode;
        first.link = save;
    }

    public void insertatlast(int data) {
        Node newnode = new Node(data);

        if (first == null) {
            first = newnode;
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = newnode;
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
        Node save = first, prev = null;
        System.out.println(
                "enter 1 of delete a first node , enter 2 of delete a specified node , enter 3 of delete a Last node");
        int key = sc.nextInt();
        if (key == 1) {
            if (first.info == data) {
                first = save.link;
                return;
            } else if (key == 2) {
                while (save != null && save.info != key) {
                    prev = save;
                    save = save.link;
                }
                if (save == null) {
                    System.out.println("node not found");
                    return;
                }
                prev.link = save.link;
            } else if (key == 3)
                while (true) {
                    prev = save;
                    save = save.link;
                    if (save.link == null) {
                        prev.link = null;
                    } else {
                        System.out.println();
                    }
                }

        }
    }

    public void insertatordered(int data) {
        Node newnode = new Node(data);

        if (first == null || newnode.info <= first.info) {
            first = newnode;
            return;
        }
        Node current = null;
        while (current.link != null && newnode.info >= current.link.info) {
            current = current.link;
        }
        newnode.link = current.link;
        current.link = newnode;
    }
}

public class Lab10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist newnode = new linkedlist();
        while (true) {
            System.out.println("1.insertatfirst");
            System.out.println("2.insertatlast");
            System.out.println("3.display");
            System.out.println("4.delete");
            System.out.println("5.insertatordered");
            System.out.println("6 for the exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter a element :");
                    int x = sc.nextInt();
                    newnode.insertatfirst(x);
                    break;
                case 2:
                    System.out.println("enter a element :");
                    int y = sc.nextInt();
                    newnode.insertatlast(y);
                    break;
                case 3:
                    newnode.display();
                    break;
                case 4:
                    System.out.println("enter a position: ");
                    int po = sc.nextInt();
                    newnode.delete(po);
                    break;
                case 5:
                    System.out.println("enter a element: ");
                    int em = sc.nextInt();
                    newnode.insertatordered(em);
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
