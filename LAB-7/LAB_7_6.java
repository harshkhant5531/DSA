import java.util.Scanner;

public class LAB_7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of data : ");
        int total_data = sc.nextInt();

        int[][] data_set = new int[total_data][2];
        int[][] ans_set = new int[total_data][2];
        int temp = 0;
        int index = 0;

        for (int i = 0; i < total_data; i++) {
            System.out.println("Enter " + (i + 1) + " set : ");
            for (int j = 0; j < 2; j++) {
                data_set[i][j] = sc.nextInt();
            }

            if (i > 0) {
                if (data_set[i - 1][1] >= data_set[i][0]) {
                    data_set[i][0] = data_set[i - 1][0] < data_set[i][0] ? data_set[i - 1][0] : data_set[i][0];
                    data_set[i][1] = data_set[i - 1][1] > data_set[i][1] ? data_set[i - 1][1] : data_set[i][1];
                } else {
                    ans_set[index][0] = data_set[i - 1][0];
                    ans_set[index][1] = data_set[i - 1][1];
                    index++;
                }
            }
        }

        ans_set[index][0] = data_set[total_data - 1][0];
        ans_set[index][1] = data_set[total_data - 1][1];
        index++;

        for (int i = 0; i < index; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ans_set[i][j] + " ");
            }

            System.out.println();
        }
    }
}