
import java.util.Scanner;

public class Lab5A_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { { 1, 2 },
                { 3, 4 },
                { 5, 6 } };

        int[][] arr1 = { { 7, 8, 9 },
                { 10, 11, 12 } };

        int c[][] = new int[arr.length][arr1[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arr[0].length; k++) {
                    sum += arr[i][k] * arr1[k][j];
                }
                c[i][j] = sum;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.println(c[i][j] + "");
            }
            System.out.println();
        }
    }
}
