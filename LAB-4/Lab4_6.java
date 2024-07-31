import java.util.Arrays;
import java.util.Scanner;

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // print frist array
        System.out.println("enter a number of n :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
        // print second array
        System.out.println("enter a number of n1 :");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            System.out.println("enter a number");
            arr1[i] = sc.nextInt();
        }
        // print merge array
        int n3 = (arr.length + arr1.length);
        int mergearr[] = new int[n + n1];
        for (int i = 0; i < n3; i++) {
            System.out.println(mergearr[i]);
        }

    }
}
