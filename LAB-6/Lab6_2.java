import java.util.Scanner;

public class Lab6_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employes you want to enter: ");
        int n=sc.nextInt();
        Employee_Detail [] emp = new Employee_Detail[n];
        for(int i=0;i<n;i++){
            emp[i]=new Employee_Detail();
        }
        for(int i=0;i<n;i++){
            emp[i].setData();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            emp[i].getData();
        }
        sc.close();
    }
   
  
}
class Employee_Detail{
    Scanner sc=new Scanner(System.in);
    int Employee_ID;
    String Name;
    String Designation;
    int Salary;

     public void setData()
    {
        System.out.println("Enter Employee_ID: ");
        this.Employee_ID=sc.nextInt();
        System.out.println("Enter Name: ");
        this.Name=sc.nextLine();
        System.out.println("Enter Designation: ");
        this.Designation=sc.nextLine();
        System.out.println("Enter Salary: ");
        this.Salary=sc.nextInt();
        sc.nextLine();
    }
    public void getData(){
        System.out.println("name: "+this.Employee_ID);
        System.out.println("name: "+this.Name);
        System.out.println("Designation: "+this.Designation);
        System.out.println("Sallary: "+this.Salary);
    }

}  
