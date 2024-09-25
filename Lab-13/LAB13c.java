import java.util.LinkedList;
import java.util.*;

class Term {
    int coeff;
    int exp;

    public Term(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
    }
}

class Polynomial {
    LinkedList<Term> terms;

    public Polynomial() {
        terms = new LinkedList<>();
    }

    public void addTerm(int coeff, int exp) {
        terms.add(new Term(coeff, exp));
    }

    public void display() {
        for (int i = 0; i < terms.size(); i++) {
            Term term = terms.get(i);
            System.out.print(term.coeff + "x^" + term.exp);
            if (i < terms.size() - 1 && terms.get(i + 1).coeff >= 0) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    public Polynomial add(Polynomial other) {
        Polynomial result = new Polynomial();
        int i = 0, j = 0;

        while (i < this.terms.size() && j < other.terms.size()) {
            Term t1 = this.terms.get(i);
            Term t2 = other.terms.get(j);

            if (t1.exp == t2.exp) {

                result.addTerm(t1.coeff + t2.coeff, t1.exp);
                i++;
                j++;
            } else if (t1.exp > t2.exp) {

                result.addTerm(t1.coeff, t1.exp);
                i++;
            } else {

                result.addTerm(t2.coeff, t2.exp);
                j++;
            }
        }

        while (i < this.terms.size()) {
            Term t = this.terms.get(i++);
            result.addTerm(t.coeff, t.exp);
        }

        while (j < other.terms.size()) {
            Term t = other.terms.get(j++);
            result.addTerm(t.coeff, t.exp);
        }

        return result;
    }
}

public class LAB13C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        System.out.println("Enter number of terms for the first polynomial: ");
        int terms1 = sc.nextInt();
        System.out.println("Enter terms for the first polynomial (coeff exp): ");
        for (int i = 0; i < terms1; i++) {
            int coeff = sc.nextInt();
            int exp = sc.nextInt();
            poly1.addTerm(coeff, exp);
        }

        System.out.println("Enter number of terms for the second polynomial: ");
        int terms2 = sc.nextInt();
        System.out.println("Enter terms for the second polynomial (coeff exp): ");
        for (int i = 0; i < terms2; i++) {
            int coeff = sc.nextInt();
            int exp = sc.nextInt();
            poly2.addTerm(coeff, exp);
        }

        System.out.println("First Polynomial: ");
        poly1.display();
        System.out.println("Second Polynomial: ");
        poly2.display();

        Polynomial result = poly1.add(poly2);

        System.out.println("Resultant Polynomial after addition: ");
        result.display();

        sc.close();
    }
}
