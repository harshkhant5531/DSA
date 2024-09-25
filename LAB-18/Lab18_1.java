// Write a program to implement a Linear Search using Array.

// public class LAB_18_1 {

//     public static void main(String[] args) {
//         int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int size = arr.length;
//         int key = 5;

//        for(int i=0;i<size-1;i++){
//         if(key==arr[i]){
//             System.out.println(arr[i-1]);
//             break;
//         }
//         else{
//             System.out.println("oops!!!!Not found");
//         }
//        }
//     }
// }

import java.util.Scanner;

public class Lab18_1 {
    public static int LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int result = LinearSearch(arr, key);

        if (result == -1) {
            System.out.println("OOOPSSSSS!!!!!!!!Entered element doesn't found in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}