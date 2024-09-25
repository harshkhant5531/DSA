import java.util.*;

public class LAB_3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number of n :" );
        int n = sc. nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is a duplicate number");
                }
                else{
                    System.out.println("here array is not contians a duplicate number");
                }
            }
        } 
    }
}
