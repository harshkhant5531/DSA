import java.util.*;
class Queue{
    int size;
    int []arr;
    int F;
    int R;

    Queue(int size){
        F=0;
        R=0;
        arr=new int[size];
        this.size=size;
    }

    //Enqueue
    void ENQUEUE(int y){
        if(R>=size){
            System.out.println("Queue Overflow");
        }
        // else{
        //     R++;
        // }
        arr[R]=y;
        R++;
        if(R==0){
            R=1;
        }
    }
   //Dequeue
   int Dequeue(int y){
    if(F==0){
        System.out.println("Queue Underflow");
    }
    y=arr[F];
    if(F==R){
        F=0;
        R=0;
    }
    else{
        F++;
    }
    return y;
   }

   //display
   void display() {
        for (int i = F; i < size; i++) {
            System.out.println("" + arr[i]);
    }

}

} 

public class LAB9A_50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of queue");
        int size=sc.nextInt();
        Queue q=new Queue(size);

        while (true) {
            System.out.println("1.ENQUEUE");
            System.out.println("2.DEQUEUE");
            System.out.println("3.display");
            
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter total element:");
                    int x = sc.nextInt();
                    q.ENQUEUE(x);
                    break;

                case 2:
                   System.out.println("Enter total element:");
                    int y = sc.nextInt();
                    q.Dequeue(y);
                    break;

                case 3:
                    q.display();
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
        
    }
}
