 

import java.util.Scanner;

public class LAB8B_8{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    boolean isPrime = true;

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      System.out.println(number + " is a prime number.");
    } else {
      System.out.println(number + " is not a prime number.");
    }
  }
}