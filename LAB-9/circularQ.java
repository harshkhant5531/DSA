import java.util.Scanner;

class Cirqueue {

    int f, r;
    int ar[];
    int size;

    Cirqueue(int size) {
        this.f = -1;
        this.r = -1;
        this.size = size;
        ar = new int[size];
    }

    public void cenqueue(int data) {

        if (r == (size - 1)) {
            r = 0;
        } else {
            r++;
        }
        if (f == r) {
            System.out.println("overflow");
        }
        ar[r] = data;
        if (f == -1) {
            f = 0;
        }
    }

    public int cdequeue() {
        if (f == -1) {
            System.out.println("underflow");
        }
        int y = ar[r];
        if (f == r) {
            f = 0;
            r = 0;
        }
        if (f == size - 1) {
            f = 0;
        } else {
            f++;
        }
        return y;
    }

    public void display() {
        if (f == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements:");
        int i = f;
        while (true) {
            System.out.print(ar[i] + " ");
            if (i == r) {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class circularQ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size: ");
        int n = sc.nextInt();
        Cirqueue cq = new Cirqueue(n);

        while (true) {
            System.out.println("1,2,3");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter a element : ");
                    int d = sc.nextInt();
                    cq.cenqueue(d);
                    break;

                case 2:
                    int data = cq.cdequeue();
                    if (data != -1) {
                        System.out.println("Dequeued element: " + data);
                    }
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    return;
            }
        }

    }
}
