// insert a node ordered

import java.util.Scanner;

class Node {

    int info;
    Node link;

    Node(int data) {
        this.info = data;
        this.link = null;
    }

    public Node first = null;

    public void insertatfirst(int data) {
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

public class Lab10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to insert : ");
        int data = sc.nextInt();
        Node newnode = new Node(data);
        newnode.insertatfirst(data);
    }
}
