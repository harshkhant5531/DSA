
import java.util.Scanner;

public class LAB4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder(input);

        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);

            if (Character.isLowerCase(c)) {
                result.setCharAt(i, Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.setCharAt(i, Character.toLowerCase(c));
            }
        }

        System.out.println("Modified string: " + result.toString());
    }
}
