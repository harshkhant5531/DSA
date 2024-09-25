import java.util.Scanner;

class Shellsort{
    void shellSort(int []arr,int n){
        for(int gap=n/2;gap>=1;gap=gap/2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i=i-gap){
                    if(arr[i+gap]>arr[i]){
                        break;
                    }
                    else{
                        int temp=arr[i+gap];
                        arr[i+gap]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }
    }
}

public class LAB22_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shellsort ss = new Shellsort();
        System.out.println("enter a size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ss.shellSort(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
