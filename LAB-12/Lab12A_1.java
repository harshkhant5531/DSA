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

    public void insertatfirst(int data){
        Node newnode = new Node(data);
    
        if(first == null ){
            first = newnode;
            return;
        }
        Node save = first;
        first = newnode;
        first.link = save;
    }

    public void insertatlast(int data){
        Node newnode = new Node(data);
    
        if(first == null ){
            first = newnode;
            return;
        }
        Node save = first;
       while (save.link!=null) {
            save = save.link;
       }
       save.link = newnode;
    }

    public void copylinkedlist(int data){
        Node newNode = new Node(data);
        Node current = first;
        first = new Node(current.info);
        Node newcurrent = first;

        if(current.link == null){
            System.out.println("underflow");
        }

        Node avail = first;
        while(current.link!=null) {
            current = current.link;
            newcurrent.link = new Node(current.info);
            newcurrent = newcurrent.link;
        }
        while(avail!=null) {
            System.out.println(avail.info+" ");
            avail = avail.link;
        }
    }
}

public class Lab12A_1 {
    public static void main(String[] args) {
        LL ll = new LL();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.insertatfirst");
            System.out.println("2.insertatlast");
            System.out.println("3.copyalinkedlist");
            System.out.println("4. for the exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter a element :");
                    int x = sc.nextInt();
                    ll.insertatfirst(x);
                    break;
                case 2:
                    System.out.println("enter a element :");
                    int y = sc.nextInt();
                    ll.insertatlast(y);
                    break;
                case 3:
                    ll.copylinkedlist(1);
                    return;
                case 4:
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
