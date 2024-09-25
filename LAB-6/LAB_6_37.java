import java.util.Scanner;

class Bank_AC {
    double ac_no;
    float balance;
    String name;


    Bank_AC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bank name of the holder: ");
        name = sc.nextLine();
        System.out.print("Enter balance: ");
        balance = sc.nextFloat();
        System.out.print("Enter Ac No:");
        ac_no = sc.nextDouble();
    }

    public void deposit_money(double money) {
        balance+=money;
        System.out.print("Money is deposited: ");
        System.out.println("This is the total balance of your ac: "+balance);
    }

    public void withdraw_money(double money) {
        if(this.balance - money < 0) {
            System.out.print("You can not withdraw money: ");
        }
        else {
            this.balance -= money;
            System.out.println("Money is withdrawed: ");
            System.out.println("This is the total balance of your ac: "+balance);

        }
    }
    public void total_balance() {
        System.out.println("This is the total balance of Your ac."+balance);
    }
}
public class LAB_6_37 {
    public static void main(String[] args) {
        Bank_AC b1 = new Bank_AC();
        b1.deposit_money(30);
    }
}