import java.util.Scanner;

public class LAB6B_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter 'C' for Celsius to Fahrenheit conversion, 'F' for Fahrenheit to Celsius conversion: ");
        char ch = sc.next().charAt(0);

        if (ch == 'C' || ch == 'c') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius = " + fahrenheit + " Fahrenheit");
        } else if (ch == 'F' || ch == 'f') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit = " + celsius + " Celsius");
        } else {
            System.out.println("Invalid choice. Please enter 'C' or 'F'.");
        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
