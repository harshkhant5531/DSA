
import java.util.Scanner;

public class LAB_7_4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of bracket : ");
        int num = sc.nextInt();
        int[] output = new int[num];
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Enter String : ");
            String str1 = sc.nextLine();
            StringBuilder str = new StringBuilder(str1);
            Boolean ans = true;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ']') {
                    int temp = j - 1;
                    while (temp >= 0) {
                        if (str.charAt(temp) == '[') {
                            ans = true;
                            str.setCharAt(temp, '0');
                            str.setCharAt(j, '0');
                            break;
                        } else if (str.charAt(temp) == '0') {
                            temp--;
                        } else {
                            ans = false;
                            break;
                        }
                    }
                } else if (str.charAt(j) == ')') {
                    int temp = j - 1;
                    while (temp >= 0) {
                        if (str.charAt(temp) == '(') {
                            ans = true;
                            str.setCharAt(temp, '0');
                            str.setCharAt(j, '0');
                            break;
                        } else if (str.charAt(temp) == '0') {
                            temp--;
                        } else {
                            ans = false;
                            break;
                        }
                    }
                } else if (str.charAt(j) == '}') {
                    int temp = j - 1;
                    while (temp >= 0) {
                        if (str.charAt(temp) == '{') {
                            ans = true;
                            str.setCharAt(temp, '0');
                            str.setCharAt(j, '0');
                            break;
                        } else if (str.charAt(temp) == '0') {
                            temp--;
                        } else {
                            ans = false;
                            break;
                        }
                    }
                }
            }

            if (ans == true && str.length() % 2 == 0) {
                output[i] = 1;
            } else {
                output[i] = 0;
            }

        }

        for (int i = 0; i < num; i++) {
            System.out.print(output[i] + " ");
        }

    }
}
