import java.util.*;

class stack {
    int size;
    int[] ar;
    int top;

    stack(int size) {
        top = -1;
        ar = new int[size];
    }

    void push(int x) {
        if (top >= ar.length - 1) {
            System.out.println("stack overflow");
        } else {
            top++;
            ar[top] = x;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("stack underflow");
        } else {
            top--;
        }
        return ar[top + 1];
    }

    void display() {
        if (top < 0) {
            System.out.println("stack underflow");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println("" + ar[i]);
            }
        }
    }

    int peep(int position) {
        if (top - position + 1 <= 0) {
            System.out.println("stack underflow");
        } else {
            return ar[top - position + 1];
        }
        return size;
    }

    int change(int position, int x) {
        if (top - position + 1 <= 0) {
            System.out.println("stack underflow");
        } else {
            ar[top - position + 1] = x;
            return x;
        }
        return size;
    }
}

public class LAB_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of stack: ");
        int size = sc.nextInt();
        stack st = new stack(size);
        while (true) {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.peep");
            System.out.println("5.chnage");
            System.out.println("6 for the exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter a element :");
                    int x = sc.nextInt();
                    st.push(x);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    System.out.println("enter a position: ");
                    int po = sc.nextInt();
                    st.peep(po);
                    break;
                case 5:
                    System.out.println("enter a position: ");
                    int position = sc.nextInt();
                    System.out.println("enter a element: ");
                    int em = sc.nextInt();
                    st.change(position, em);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }
}
