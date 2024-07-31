
import java.util.Scanner;

public class LAB9C_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of seconds: ");
    int seconds = sc.nextInt();
    int hours = seconds / 3600;
    int minutes = (seconds % 3600) / 60;
    seconds = seconds % 60;
    System.out.println(hours + ":" + minutes + ":" + seconds);
  }
}