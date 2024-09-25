class Node{
    int data;
    Node link;

    public Node(int data){
        this.data=data;
        this.link=null;
    }
}
class Queue{
      Node front;
      Node rear;
      
      public Queue(){
        front=null;
        rear=null;
      }
      public boolean isEmpty(){
        return(front==null);
      }

      void enqueue(int data) {
        Node newNode=new Node(data);
        if(rear==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.link=newNode;
            rear=newNode;
        }
    } 
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        int delete=front.data;
        front=front.link;

        if(front==null){
            rear=null;
        }
        return delete;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
    }
}

public class LAB_11_2 {
    public static void main(String[] args) {
        
    }
}
