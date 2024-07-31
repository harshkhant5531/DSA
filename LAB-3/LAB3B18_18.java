
import java.util.Scanner;

public class LAB3B18_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the first number to be replaced: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number to replace the first number: ");
        int secondNumber = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == firstNumber) {
                array[i] = secondNumber;
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("The first number is not found in the array.");
        } else {
            System.out.println("Index of the replaced number: " + index);
            System.out.println("Final array:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}