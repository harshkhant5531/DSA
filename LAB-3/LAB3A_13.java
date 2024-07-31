//Write a program to read and display n numbers using an array

import java.util.Scanner;

public class LAB3A_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("The entered numbers are:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}