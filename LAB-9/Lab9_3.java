class DoublyQueue {
    int a[];
    int n;
    int f;
    int r;

    DoublyQueue(int n) {
        this.n = n;
        a = new int[n];
        this.f = -1;
        this.r = -1;
    }

    public void addFirst(int data) {
        if (f == -1) {
            f++;
            r++;
        }
        if (f == 0) {
            System.out.println("Overflow");
            return;
        } else {
            a[f--] = data;
        }
    }

    public void addLast(int data) {
        if (r == -1) {
            f++;
            r++;
        }
        if (r >= n) {
            System.out.println("Overflow");
            return;
        } else {
            a[r++] = data;
        }
    }

    public int deleteFront() {
        if (f == -1) {
            f++;
            r++;
        }
        if (f >= n) {
            System.out.println("Underflow");
            return -1;
        } else {
            int y = a[f];
            f++;
            return y;
        }
    }

    public int deleteRear() {
        if (r == -1) {
            f++;
            r++;
        }
        if (r == 0) {
            System.out.println("Underflow");
            return -1;
        } else {
            int y = a[r];
            r--;
            return y;
        }
    }

    public void print() {
        for (int i = f; i < r; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

public class Lab9_3 {
    public static void main(String[] args) {
        DoublyQueue d1 = new DoublyQueue(10);
        d1.addLast(1);
        d1.addLast(2);
        d1.addLast(3);
        d1.addLast(4);

        d1.deleteFront();

        d1.deleteRear();

        d1.addFirst(19);

        d1.print();

    }
}