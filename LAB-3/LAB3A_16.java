//Write a program to find position of the smallest number & the largest number from given n numbers. 

import java.util.Scanner;

public class LAB3A_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int smallestIndex = 0;
        int largestIndex = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] < numbers[smallestIndex]) {
                smallestIndex = i;
            }

            if (numbers[i] > numbers[largestIndex]) {
                largestIndex = i;
            }
        }

        System.out.println("The smallest number position  " + (smallestIndex + 1));
        System.out.println("The largest number position " + (largestIndex + 1));
    }
}