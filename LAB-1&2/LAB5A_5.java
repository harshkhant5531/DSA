public class LAB5A_5 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + findFactorial(num));
    }

    public static int findFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * findFactorial(num - 1);
        }
    }
}
