import java.util.*;
public class LAB_3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m:");
        int m = sc.nextInt();
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        double ans = 0;
        for(int i=m;i<=n;i++){
            ans+=(i);
        }
        System.out.println("Sum of n numbers:"+ans);
    }
}
