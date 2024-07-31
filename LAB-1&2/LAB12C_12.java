
public class LAB12C_12 {
  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
      int num = i;
      int sum = 0;
      while (num != 0) {
        int rem = num % 10;
        sum = sum + (rem * rem * rem);
        num = num / 10;
      }
      if (sum == i) {
        System.out.println(i);
      }
    }
  }
}