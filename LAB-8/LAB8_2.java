import java.util.Stack;

public class LAB8_2 {

    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String reverseAndSwap(String expr) {
        StringBuilder result = new StringBuilder();
        for (int i = expr.length() - 1; i >= 0; i--) {
            char c = expr.charAt(i);
            if (c == '(') {
                result.append(')');
            } else if (c == ')') {
                result.append('(');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }

            else if (c == '(') {
                stack.push(c);
            }

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }

            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static String infixToPrefix(String expression) {

        String reversedExpression = reverseAndSwap(expression);

        String postfix = infixToPostfix(reversedExpression);

        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String expression = "(a-b/c)*(a/k-l)";
        System.out.println("Infix Expression: " + expression);
        String prefix = infixToPrefix(expression);
        System.out.println("Prefix Expression: " + prefix);
    }
}
