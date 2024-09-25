import java.util.*;

public class LAB_8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = sc.nextLine();
        String temp = "";
        
        String polish = "";
        int rank = 0;
        int idx = 0;
        int top = 0;
        char ch = temp.charAt(idx);
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        top++;
        while (ch != ' ') {
            if (top < 1) {
                System.out.println("Invalid String");
                return;
            }
            while (G(stack.peek()) > F(ch)) {
                char ch1 = stack.pop();
                polish += ch1;
                rank += R(ch1);
            }
            if (rank < 1) {
                System.out.print("Invalid String");
                return;
            }
            if (G(stack.peek()) != F(ch)) {
                stack.push(ch);
                top++;
            } else {
                stack.pop();
                top--;
            }
            idx++;
            ch = temp.charAt(idx);
            while (top > 1) {
                char ch1 = stack.pop();
                polish += ch1;
                top--;
                rank += R(ch1);
            }
            if (top != 1 || rank != 1) {
                System.out.println("Invalid String");
            } else {
                System.out.print("String Is: " + polish);
            }
        }
    }

    public static int F(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            case '(':
                return 9;
            case ')':
                return 0;

        }
        return 7;
    }

    public static int G(char c) {
        switch (c) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            case '(':
                return 0;
            case ')':
                return 0;
        }
        return 7;
    }

    public static int R(char c) {
        switch (c) {
            case '+':
            case '-':
                return -1;
            case '*':
            case '/':
                return -1;
            case '^':
                return -1;
        }
        return 1;
    }
} 