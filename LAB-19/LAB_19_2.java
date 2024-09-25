import java.util.Arrays;
import java.util.Scanner;

public class LAB_19_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        arr = insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static int[] insertionSort(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            i++;
        }
        return arr;
    }
}
