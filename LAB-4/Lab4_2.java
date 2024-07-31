import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc. nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n-1]; 
        System.out.println("enter a number of index :" );
        int index = sc.nextInt();

        for(int i=0;i<n;i++){
        System.out.println("enter a number");
        arr[i] = sc.nextInt();
        }

        for(int i=0;i<index;i++){
        arr1[i] = arr[i];
        }

        for(int j=index+1;j<arr.length;j++){
            arr1[j-1] = arr[j];
        }
        System.out.println("");
        for(int k=0;k<n-1;k++){
            System.out.println(arr1[k]);
        }
    }
}
