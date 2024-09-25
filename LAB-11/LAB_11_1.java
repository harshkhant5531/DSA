import java.util.*;

class Node {
    int info;
    Node link;

    Node(int data) {
        this.info = data;
        this.link = null;
    }
}

class stack {
    Node top;

    stack() {
        top = null;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        Node node1 = new Node(data);

        if (isEmpty()) {
            top = node1;

        } else {

            node1.link = top;
            top = node1;
        }
    }

    public void pop(int data) {
        Node node1 = new Node(data);
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {

            top = top.link;
        }
    }

    void display() {

        if (isEmpty()) {
            System.out.println("stack underflow");
        } else {
            Node save = top;

            while (save != null) {
                System.out.println(save.info);
                save = save.link;
            }
        }
    }
}

public class LAB_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack st = new stack();
        while (true) {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter a element :");
                    int x = sc.nextInt();
                    st.push(x);
                    break;
                case 2:
                    int a = sc.nextInt();
                    st.pop(a);
                    break;
                case 3:
                    st.display();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
