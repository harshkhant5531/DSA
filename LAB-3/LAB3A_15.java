//Write a program to calculate average of first n numbers.

import java.util.Scanner;

public class LAB3A_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num[i];
        }
        System.out.println("The average of the first " + n + " numbers is: " + sum / n);
    }
}