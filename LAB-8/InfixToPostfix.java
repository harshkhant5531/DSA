public class InfixToPostfix {

    int top = -1;
    char stack[] = new char[100];
    String postfix = "";
    int rank = 0;

    void push(char c) {
        stack[++top] = c;
    }

    char pop() {
        return stack[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int ipf(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    int spf(char c) {
        switch (c) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            default:
                return 0;
        }
    }

    String infixToPostfix(String infix) {
        push('(');
        infix += ')';

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix += c;
                rank++;
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (stack[top]!= '(') {
                    postfix += pop();
                    rank--;
                }
                if (stack[top] == '(') {
                    pop();
                }
            } else {
                while (!isEmpty() && stack[top]!= '(' && spf(stack[top]) >= ipf(c)) {
                    postfix += pop();
                    rank--;
                }
                push(c);
            }
        }

        if (rank != 1 && !isEmpty()) {
            return "INVALID";
        }

        return postfix;
    }

    public static void main(String[] args) {
        InfixToPostfix converter = new InfixToPostfix();
        String infixExpression = "a+b*c";
        String postfixExpression = converter.infixToPostfix(infixExpression);
        System.out.println("Infix expression: " + infixExpression);
        System.out.println("Postfix expression: " + postfixExpression);
    }
}





// import java.util.*;
// import java.util.Scanner;

// class stack {
//     char [] s;
//     StringBuffer p;
//     char temp;
//     int rank;
//     int top; 
    
//      stack(){
//         top=-1;
//         s=new char[50];
//         p = new StringBuffer();
//         rank=0;
//     }

//     public void infixToPostfix(String str){
//         str += ')';
//         push('(');
//         char next ;
//        for(int i=0;i<str.length();i++){
//         next = str.charAt(i);
        
//             if(top<-1){
//                 System.out.println("invalid");
//                 break;
//             }
//             while (G(s[top])>F(next)) {
//                 temp = pop();
//                 p.append(temp);
//                 rank += R(temp);
//                 if(rank<0){
//                     System.out.println("invalid");
//                     break;
//                 }
//             }

//             if(G(s[top])!=F(next)){
//                 push(next);
//             }
//             else{
//                 pop();
//             }

//         }

       
//        if(top!=-1 || rank !=1){
//         System.out.println("invalid");
//        }
//        else{
//         System.out.println("valid");
//        }
//        System.out.println(p);
//     }

//     void push(char x) {
//         if (top >= s.length - 1) {
//             System.out.println("stack overflow");
//         } else {
//             top++;
//             s[top] = x;
//         }
//     }

//     char pop() {
//         if (top < 0) {
//             System.out.println("stack underflow");
//         } else {
//             top--;
//         }
//         return s[top + 1];
//     }

//     public int F(char ch) {
//         switch (ch) {
//             case '+', '-':
//                 return 1;

//             case '*', '/':
//                 return 3;

//             case '^':
//                 return 6;

//             case '(':
//                 return 9;

//             case ')':
//                 return 0;

//             default:
//                 return 7;

//         }
//     }

//     public int G(int s2) {
//         switch (s2) {
//             case '+', '-':
//                 return 2;

//             case '*', '/':
//                 return 4;

//             case '^':
//                 return 5;

//             case '(':
//                 return 0;

//             default:
//                 return 8;

//         }
//     }

//     public int R(char ch) {
//         switch (ch) {
//             case '+', '-':
//                 return -1;

//             case '*', '/':
//                 return -1;

//             case '^':
//                 return -1;
//             default:
//                 return 1;

//         }
//     }
// }

// public class LAB_8_1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         stack st1 = new stack();
//         System.out.println("Enter Infix String");
//         String str = sc.nextLine();
//         st1.infixToPostfix(str);
//     }
// }
