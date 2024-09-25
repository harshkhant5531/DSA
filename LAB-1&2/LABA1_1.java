
import java.util.Scanner;

public class LABA1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("The area of the circle with radius " + r + " is: " + area);
      

    }
}
