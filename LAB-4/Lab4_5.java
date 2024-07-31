import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("enter a number of n :" );
        int n = sc. nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n+1];

        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                for(i=0;i<arr[i];i++){
                    arr1[i] = arr[i];
                    }
            
                    for( j=arr[i]+1;j<arr.length;j++){
                        arr1[j-1] = arr[j];
                    }
                    System.out.println("");
                    for(int k=0;k<n-1;k++){
                        System.out.println(arr1[k]);
                    }
            } 
        }
    }
    }
}

