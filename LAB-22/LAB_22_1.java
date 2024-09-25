import java.util.*;

class HeapSort{

    public void Hpsort(int []arr,int n){
        maxHeap(arr,n);
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }

    public void maxHeap(int []arr,int n){
        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }

    public void heapify(int []arr,int n,int i){
        int max = i;
        int leftleaf=(i*2)+1;
        int rightleaf=(i*2)+2;

        if(leftleaf<n && arr[leftleaf]>arr[max]){
            max=leftleaf;
        }

        if(rightleaf<n && arr[rightleaf]>arr[max]){
            max=rightleaf;
        }

        if(i!=max){
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            heapify(arr,n,max);
        }
    }
    // public void swap(int a,int b){
    //     int y = a;
    //      a = b;
    //      b = y;
    // }

}

public class LAB_22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeapSort h = new HeapSort();
        System.out.println("enter a size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        h.Hpsort(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
