//Write a program to calculate sum of numbers from m to n.

import java.util.Scanner;

public class LAB3A_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from " + m + " to " + n + " is: " + sum);
    }
}
