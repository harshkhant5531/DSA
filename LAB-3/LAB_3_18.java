import java.util.*;

public class LAB_3_18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("enter a number of n :" );
        int n = sc. nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a number ");
        int a = sc.nextInt();
        System.out.println("enter a number ");
        int b = sc.nextInt();
        int temp;

        System.out.println("index1 = "+arr[a]);
        System.out.println("index2 = "+arr[b]);
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        for(int i=0;i<n;i++){
           System.out.println(arr[i]);
        }
    }
}

