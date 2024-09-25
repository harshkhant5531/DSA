import java.util.Stack;
import java.util.Scanner;

public class LAB_7_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<Character>();

        int i = 0;
        int count = 0;
        int top = 1;

        while (i < str.length()) {
            char c = str.charAt(i);
            stack.push(c);
            top++;
            i++;
        }

        while (top != 1) {
            char x = stack.pop();

            if (x == 'a') {
                count++;
            } else {
                count--;
            }

            top--;
        }

        if (count == 0) {
            System.out.print("Valid String  ");
        } else {
            System.out.print("Invalid String  ");
        }
    }
}