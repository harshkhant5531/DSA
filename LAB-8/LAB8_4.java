import java.util.Stack;
import java.util.Scanner;

public class LAB8_4 {

    static Stack<Double> stack = new Stack<>();

    public static double evaluatePrefix(String s) {
        String[] part = s.split(",");

        for (int i = 0; i < part.length; i++) {
            part[i] = part[i].trim();
        }
        for (int i = part.length - 1; i >= 0; i--) {
            String temp = part[i];
            if (Character.isDigit(temp.charAt(0))) {
                stack.push(Double.parseDouble(temp));
            } else {
                double operand1 = stack.pop();
                double operand2 = stack.pop();

                operation(operand1, operand2, temp);

            }

        }
        return stack.pop();
    }

    public static void operation(double operand1, double operand2, String temp) {

        switch (temp) {
            case "+":
                stack.push(operand1 + operand2);
                break;
            case "-":
                stack.push(operand1 - operand2);
                break;
            case "*":
                stack.push(operand1 * operand2);
                break;
            case "/":
                stack.push(operand1 / operand2);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prefix expression");
        String s = sc.next();
        System.out.println(evaluatePrefix(s));
        sc.close();
    }
}
