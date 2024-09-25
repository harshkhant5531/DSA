import java.util.Scanner;
import java.util.Stack;

public class evaluatePostfix {
    public static double Eval(String a){
        String[] b = (a.split(","));
        Stack<String> st = new Stack<>();
        double ans = 0;
        double opt2;
        double opt1;
        String s1;

        for(int i = 0; i < b.length; i++){
            if(b[i].equals("+") || b[i].equals("-") || b[i].equals("*") || b[i].equals("/") || b[i].equals("%")){
                opt2 = Double.parseDouble(st.pop());
                opt1 = Double.parseDouble(st.pop());

                switch (b[i]) {
                    case "+":
                        ans = opt1 + opt2;
                        break;
                    case "-":
                        ans = opt1 - opt2;
                        break;
                    case "*":
                        ans = opt1 * opt2;
                        break;
                    case "/":
                        ans = opt1 / opt2;
                        break;
                    case "%":
                        ans = opt1 % opt2;
                        break;
                }
                s1 = "" + ans;
                st.push(s1);
            } else {
                st.push(b[i]);
            }
        }
        return Double.parseDouble(st.pop());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postfix expression (elements separated by commas):");
        String a = sc.nextLine();
        double answer = Eval(a);
        System.out.println("The result is: " + answer);
    }
}