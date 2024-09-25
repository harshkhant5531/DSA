import java.util.*;

public class LAB_3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        int x[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter values:");
            x[i] = sc.nextInt();
        }
        int smi = 0, lgi = 0, small = x[0], large = x[0];
        for (int i = 0; i < n; i++) {
            if (x[i] < small) {
                small = x[i];
                smi = i;
            }
            if (x[i] > large) {
                large = x[i];
                lgi = i;
            }
        }
        System.out.println(smi+"smallest");
    }
}
