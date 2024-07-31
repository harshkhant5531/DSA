class Node{
    int data;
    Node link;

    Node(int data){
        this.data=data;
        this.link=null;
    }
}
class Queue{
    Node Front;
    Node Rear;

    Queue(){
        Front=null;
        Rear=null;
    }

    public boolean isEmpty(){
        return (Front==null);
    }
//ENQUEUE
    void ENQUEUE(int data){
        Node newNode=new Node(data);
        if(Rear==null){
            Front=newNode;
            Rear=newNode;
        }
        else{
            Rear.link=newNode;
            Rear=newNode;
        }
    }
//DEQUEUE
int DEQUEUE(){
    if(isEmpty()){
System.out.println("Empty");
    }
    int delete=Front.data;
    Front=Front.link;

    if(Front==null){

    }
}

}

public class LAB_11_61 {
    public static void main(String[] args) {
        
    }
}
