import java.util.*;

public class LAB6A_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = sc.nextInt();
        System.out.println("Enter your Second number:");
        int b = sc.nextInt();
        System.out.println("Before Swapping:" + a + "," + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:" + a + "," + b);
        System.out.println();

    }
}