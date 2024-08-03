import java.util.*;

public class Lab9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of queue");
        int l = sc.nextInt();
        CirQueue q1 = new CirQueue(l);
        sc.close();
        while (true) {
            System.out.println("Enter 1 for enqueue");
            System.out.println("Enter 2 for dequeue");
            System.out.println("Enter 3 for display queue");
            System.out.println("Enter 4 for exit");

            int c = sc.nextInt();
            int data;
            if (c == 1) {
                data = sc.nextInt();
                q1.enQueue(data);
            } else if (c == 2) {
                q1.deQueue();
            } else if (c == 3) {
                q1.display();
            } else if (c == 4) {
                break;
            }
        }
    }
}

class CirQueue {
    static int Front;
    static int Rear;
    int array[];
    int length;
    int y;

    public CirQueue(int l) {
        array = new int[l];
        Front = 0;
        Rear = -1;
    }

    public void enQueue(int data) {
        if (Rear == length) {
            Rear = -1;
        } else if (Rear == length) {
            System.out.println("Queue overflow");
        } else {
            Rear++;

            array[Rear] = data;
        }

    }

    public int deQueue() {
        if (Front == -1) {
            System.out.println("Queue underflow");
        }

        else if (Front == Rear) {
            Rear = -1;
            Front = 0;
        } else {
            Front++;
            y = array[Front];
        }
        return y;
    }

    public void display() {
        for (int i = Front; i <= Rear; i++) {
            System.out.println(array[i]);
        }
    }
}