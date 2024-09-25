import java.util.Scanner;
import java.util.Arrays;

// class binarySearch {
//     int left;
//     int right;
//     int arr[];
//     int size;

//     binarySearch(int size) {
//         this.left = 0;
//         this.right = size - 1;
//         arr = new int[size];
//     }

//     public int mid;

//     public void bSearch(int key) {
//         while (left <= right) {
//             mid = (left + right) / 2;
//             if (arr[mid] == key) {
//                 System.out.println(mid);
//                 return;
//             }

//             else if (key < arr[mid]) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }
//     }

//Write a program to implement a Binary Search using Array.

public class Lab18_2 {
    public static int BinarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
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

        Arrays.sort(arr);

        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();

        int result = BinarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + (result - 1));
        }
    }
}
