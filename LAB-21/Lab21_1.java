import java.util.Scanner;

class ms {
    public void mergesort(int low, int high, int[] ar) {
        if (low < high) {
            int mid = (int) Math.floor((low + high) / 2);
            mergesort(low, mid, ar);
            mergesort(mid + 1, high, ar);
            merge(low, mid, high, ar);
        }
    }

    public void merge(int low, int mid, int high, int[] ar) {
        int h, i, j;
        int[] b = new int[high + 1];
        h = low;
        i = low;
        j = mid + 1;
        while (h <= mid && j <= high) {
            if (ar[h] <= ar[j]) {
                b[i] = ar[h];
                h++;
            } else {
                b[i] = ar[j];
                j++;
            }
            i++;
        }
        if (h > mid) {
            for (int k = j; k <= high; k++) {
                b[i] = ar[k];
                i++;
            }
        } else {
            for (int k = h; k <= mid; k++) {
                b[i] = ar[k];
                i++;
            }
        }
        for (int k = low; k <= high; k++) {
            ar[k] = b[k];
        }
    }
}

public class Lab21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ms m = new ms();
        System.out.println("enter a size of array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("enter element : ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        m.mergesort(0, n - 1, ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ",");
        }
    }
}

// import java.util.*;
// public class LAB_21_1 {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of elements in the array: ");
// int n = sc.nextInt();
// int[] arr = new int[n];
// System.out.println("Enter the elements of the array: ");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// }
// public void divide(int low,int high){
// int [] arr = new int[high-low+1];
// if(low<high){
// int mid=(int)Math.floor((low+high)/2);
// divide(low, high);
// divide(mid+1, high);
// conquer(low,mid,high);
// }
// }
// public void conquer(int low,int mid,int high){
// int [] arr = new int[high-low+1];
// int h,i,j,k;
// int[] b=new int[high-low+1];
// h=low;
// i=0;
// j=mid+1;

// while (h<=mid && j<=high) {
// if(arr[h]<=arr[j]){
// b[i]=arr[h];
// h++;
// }
// else{
// b[i]=arr[j];
// j++;
// }
// i++;
// }
// if (h>mid) {
// for (int n=j;j<=high;n++) {
// b[i]=arr[n];
// i++;
// }
// }
// else{
// for (int n=h;h<=mid;n++) {
// b[i]=arr[n];
// i++;
// }
// }
// for(int n=low;low<=high;n++){
// arr[n]=b[n];
// }
// }
// }
