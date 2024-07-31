
import java.util.*;

public class LAB3C_20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of names: ");
    int n = sc.nextInt();
    String[] names = new String[n];

    System.out.println("Enter the names:");
    for (int i = 0; i < n; i++) {
      names[i] = sc.next();
    }

    Arrays.sort(names);

    System.out.println("Sorted names in alphabetical order:");
    for (String name : names) {
      System.out.println(name);
    }
  }
}
