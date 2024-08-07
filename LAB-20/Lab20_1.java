
import java.util.*;

public class Lab20_1 {

    public static int[] SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min_index]) {
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

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
}
