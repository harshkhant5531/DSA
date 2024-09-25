import java.util.Scanner;

class countsort {
    public void count_sort(int[] arr, int k) {
        int n = arr.length;
        int[] count = new int[k + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        countsort cs = new countsort();

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the maximum element value (k):");
        int k = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        cs.count_sort(arr, k);
        System.out.println("-------------------------------------");
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}