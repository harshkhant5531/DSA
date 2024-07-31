import java.util.Scanner;
import java.io.*;

public class LAB3B_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your element:");
            a[i] = sc.nextInt();

        }
        try {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[j] == a[k]) {
                        System.out.println("Duplicate array found");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
