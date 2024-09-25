import java.util.Scanner;

public class LAB_11_3 {

    static class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    static Node first = null;

    public static void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of node : ");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }
        Node temp = first;

        while (temp.link != null) {
            temp = temp.link;
        }

        temp.link = newNode;

    }

    public static void removeDuplicate() {
        Node current = first;
        while (current != null && current.link != null) {
            Node prev = current;
            Node next = current.link;

            while (next != null) {
                if (current.info == next.info) {
                    prev.link = next.link;
                } else {
                    prev = next;
                }
                next = next.link;
            }

            current = current.link;
        }

        Node tempNode = first;

        while (tempNode != null) {
            System.out.print(tempNode.info + " ");
            tempNode = tempNode.link;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        P_62 node = new P_62();
        Boolean isTrue = true;

        while (isTrue) {
            node.insert();
            System.out.println("if you add more than enter 1 :");
            int ans = sc.nextInt();

            if (ans == 1) {
                isTrue = true;
            } else {
                isTrue = false;
            }
        }

        node.removeDuplicate();
    }
}