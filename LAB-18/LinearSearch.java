
public class LinearSearch {

    public static void main(String[] args) {
        int key = 7868;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("not available");
    }
}
