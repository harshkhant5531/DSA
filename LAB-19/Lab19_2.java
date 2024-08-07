
import java.util.Scanner;

class Lab19_2 {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

}
