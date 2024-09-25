import java.util.*;
public class LAB_3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        double avg = 0;
        for(int i=0;i<=n;i++){
            avg+=i;
        }
        
        System.out.println(avg/n);
    }
}
