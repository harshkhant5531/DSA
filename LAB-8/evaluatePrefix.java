import java.util.Scanner;
import java.util.Stack;

public class evaluatePrefix {
    public static double Eval(String a) {
        String[] b = a.split(",");
        Stack<Double> st = new Stack<>();
        double opt2;
        double opt1;

        for (int i = b.length - 1; i >= 0; i--) {
            if (b[i].equals("+") || b[i].equals("-") || b[i].equals("*") || b[i].equals("/") || b[i].equals("%")) {
                opt1 = st.pop();
                opt2 = st.pop();

                switch (b[i]) {
                    case "+":
                        st.push(opt1 + opt2);
                        break;
                    case "-":
                        st.push(opt1 - opt2);
                        break;
                    case "*":
                        st.push(opt1 * opt2);
                        break;
                    case "/":
                        st.push(opt1 / opt2);
                        break;
                    case "%":
                        st.push(opt1 % opt2);
                        break;
                }
            } else {
                st.push(Double.parseDouble(b[i]));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prefix expression (elements separated by commas):");
        String a = sc.nextLine();
        double answer = Eval(a);
        System.out.println("The result is: " + answer);
        sc.close();
    }
}
