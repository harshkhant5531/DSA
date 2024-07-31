import java.util.Scanner;

class Employee_Detail {

    int Employee_ID;
    String Name;
    String Designation;
    double Salary;

    public Employee_Detail(int id, String name, String designation, double salary) {
        this.Employee_ID = id;
        this.Name = name;
        this.Designation = designation;
        this.Salary = salary;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + Employee_ID);
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + Salary);
    }
}

public class LAB6A_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee_Detail employee = new Employee_Detail(id, name, designation, salary);

        System.out.println("\nEmployee Details:");
        employee.printDetails();
    }
}
