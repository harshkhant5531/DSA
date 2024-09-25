import java.util.*;

public class LAB_3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        int x[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter values:");
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(x[i]);
        }
    }
}