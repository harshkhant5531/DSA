
import java.util.Scanner;

public class LAB10C_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of days: ");
    int days = sc.nextInt();
    int year = days / 365;
    days = days % 365;
    int week = days / 7;
    days = days % 7;
    System.out.println(year + " years " + week + " weeks " + days + " days");
  }
}