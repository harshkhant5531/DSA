import java.util.*;

class LL{
    class Node{
        int info;
        Node link;

        Node(int data){
            this.info=data;
            this.link=null;
        }
    }
public Node first;
    public Node reverseLL(){
        Node pred = null;
        Node current = first;
        Node next = first.link;

        while(next!=null){
           
            current.link=pred;
            pred=current;
            current = next;
            next=next.link;
        }
        return pred;
    }
    public void insertAtFirst(int data){
        Node node1 = new Node(data);
    
        if(first == null ){
            first = node1;
            return;
        }
        node1.link = first;
        first =node1;
    }
}

public class LAB_12_2 {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertAtFirst(1);
        list1.insertAtFirst(2);
        list1.insertAtFirst(3);
        list1.insertAtFirst(4);
        
        LL.Node reversedList = list1.reverseLL();
        LL.Node current = reversedList;
        while (current != null) {
            System.out.print(current.info + "->");
            current = current.link;
        }
        System.out.println("NULL");
    }
}