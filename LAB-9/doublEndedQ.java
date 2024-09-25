import java.util.*;

class DEQueue{
    int arr[];
    int n;
    int f=-1;
    int r=-1;

    DEQueue(int n){
        this.n = n;
        arr = new int[n];
    }

    int DEQueue(){
        if(f==-1){
            System.out.println("Queue is Underflow");
        }
        int y= arr[r];
        if(f==r){
            f=-1;
            r=-1;
        }
            f++;
        return y;
    }

    void DEQInsertF(int x){
        if(f==0){
            System.out.println("queue underflow");
        }
        else if(f==-1){
            f=0;
            r=0;
        }
        else{
            f--;
        }
        arr[f] = x;
    }

    void DEQInsertR(int x){
        if(((r+1)%n)==f){
            System.out.println("queue overflow");
        }
        else if(f==-1){
            f=0;
            r=0;
        }
        else{
            r=(r+1)%n;
        }
        arr[r] = x;
    }

    void display(){
        if(f==-1){
            System.out.println("queue is empty");
            return;
        }
        int i=f;
        while(true){
            System.out.print(arr[i]+" ");
            if(i==r){
                break;
            }
            i=(i+1)%n;
        }
        System.out.println();
    }
}

public class doublEndedQ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DEQueue q = new DEQueue(n);
        q.DEQInsertR(10);
        q.DEQInsertR(20);
        q.DEQInsertR(30);
        q.DEQInsertR(40);
        q.DEQInsertR(50);
        q.display();
        // q.DEQInsertR(50);
        // q.display();
        q.display();
        q.DEQInsertF(10);

    }
}