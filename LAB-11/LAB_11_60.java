import java.util.Scanner;

class Stack{

    Scanner sc = new Scanner(System.in);
    int top;
    class Node{
        
        int info;
        Node link;
        

        Node(int data){
            this.info = data;
            this.link = null;
        }

        public boolean isEmpty() {
            if(top == 0){
                return false;
            }
            return true;
           
        }
    }
    Node first = null;
    int peep(int position){
        Node temp = first;
        if(top>0){
            System.out.println("stack underflow");
        }
        else{
            for (int i = 0; i<position; i++) {
                temp = temp.link;
            }
            
    }
    return temp.info;
}

    public void push(int data){
        Node newnode = new Node(data);
            if(first == null ){
                first = newnode;
                return;
            }
            Node save = first;
            first = newnode;
            first.link = save;
        }

    public void pop(int data){
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

    public void display(){
        Node save = first;
        if(first == null){
            System.out.println("underflow");
        }
        else{
          while (save != null) {
               System.out.println(save.info);
               save = save.link;
          }
        }
    }
}
public class LAB_11_60{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        while (true) {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.peep");
            System.out.println("5 for the exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter a element :");
                    int x = sc.nextInt();
                    s.push(x);
                    break;
                case 2:
                    System.out.println("enter a element :");
                    int y = sc.nextInt();
                    s.pop(y);
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("enter a element: ");
                    int p = sc.nextInt();
                    int value = s.peep(p);
                    System.out.println(value);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
