public class BinarySearch {
    public static void main(String[] args) {
        int key = 9;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("not available");
    }
}