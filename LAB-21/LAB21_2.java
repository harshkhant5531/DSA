import java.util.Arrays;
import java.util.Scanner;

public class LAB21_2 {

    public static void quickSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int pivot = partition(arr, lb, ub);
            quickSort(arr, lb, pivot - 1);
            quickSort(arr, pivot + 1, ub);
        }
    }

    public static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int i = lb + 1;
        int j = ub;
        boolean flag = true;

        while (flag) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (j >= i && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            } else {
                flag = false;
            }
        }
        swap(arr, lb, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}