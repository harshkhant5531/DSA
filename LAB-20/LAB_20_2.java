import java.util.Arrays;
import java.util.Scanner;

class RadixSort {
    void rs(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, n, place);
        }
    }

    void countSort(int[] arr, int n, int place) {
        int output[] = new int[n];
        int i;
        int[] count = new int[10];
        for (i = 0; i < 10; i++) {
            count[i] = 0;
        }
        for (i = 0; i < n; i++) {
            count[(arr[i] / place) % 10]++;
        }
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / place) % 10] - 1] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}

public class LAB_20_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RadixSort r = new RadixSort();
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        r.rs(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
