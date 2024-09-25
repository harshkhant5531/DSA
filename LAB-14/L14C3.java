import java.util.Scanner;

public class L14C3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        while (t-- > 0) {
            // Read the two nodes
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            // Initialize the distance
            int distance = 0;

            // Calculate the distance between nodes
            while (i != j) {
                if (i > j) {
                    i /= 2;  // Move to the parent node
                } else {
                    j /= 2;  // Move to the parent node
                }
                distance++;
            }

            // Print the result for the current test case
            System.out.println(distance);
        }

        scanner.close();
    }
}