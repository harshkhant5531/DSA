// Write a program to implement Selection Sort using Array.
import java.util.Arrays;
import java.util.Scanner;

public class LAB_20_1 {

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < (arr.length-1); i++) {
            int min_index = i;
            for (int j = i + 1; j < (arr.length); j++) {
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        return arr;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        arr = selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}