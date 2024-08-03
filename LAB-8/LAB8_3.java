import java.util.*;
import java.util.Stack;

public class LAB8_3 {

	static int evaluatePostfix(String exp) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			if (Character.isDigit(c)) {
				stack.push(c - '0');
			}

			else {
				int operand1 = stack.pop();
				int operand2 = stack.pop();

				switch (c) {
					case '+':
						stack.push(operand2 + operand1);
						break;
					case '-':
						stack.push(operand2 - operand1);
						break;
					case '/':
						stack.push(operand2 / operand1);
						break;
					case '*':
						stack.push(operand2 * operand1);
						break;
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your expression:");
		String exp = sc.nextLine().trim();

		System.out.println("postfix evaluation: "
				+ evaluatePostfix(exp));
	}
}
