import java.util.*;

class Student_Detail {
    int enrollmentNo;
    String name;
    int semester;
    double cpi;

    public Student_Detail(int enrollmentNo, String name, int semester, double cpi) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.semester = semester;
        this.cpi = cpi;
    }

    public String toString() {
        return "Student_Detail{" +
                "enrollmentNo=" + enrollmentNo +
                ", name='" + name + '\'' +
                ", semester=" + semester +
                ", cpi=" + cpi +
                '}';
    }
}

public class LAB6A_35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Detail[] students = new Student_Detail[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enrollment No: ");
            int enrollmentNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int semester = sc.nextInt();
            System.out.print("CPI: ");
            double cpi = sc.nextDouble();

            students[i] = new Student_Detail(enrollmentNo, name, semester, cpi);
        }
        for (Student_Detail student : students) {
            System.out.println(student);
        }

    }
}