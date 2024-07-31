

import java.util.Scanner;

public class Lab5A_1 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        int arr[][] = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            System.out.println("enter a number in arr");
            arr[i][j] = sc.nextInt();
            }
        }
    
        int arr1[][] = new int[2][2];

            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                System.out.println("enter a number in arr1");
                arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println();
        int c[][] = new int[2][2];
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    c[i][j] = arr[i][j] + arr1[i][j];
                    System.out.println(c[i][j]);
                }
                System.out.println();
            }
        

    }
}
