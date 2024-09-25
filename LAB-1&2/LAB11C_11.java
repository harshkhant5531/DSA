import java.util.Scanner;

public class LAB11C_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                temp += j;
            }
            sum += temp;
        }
        System.out.println("The sum of 1 + (1+2) + (1+2+3) + (1+2+3+4)+ ...+(1+2+3+4+....+n) is: " + sum);
    }
}