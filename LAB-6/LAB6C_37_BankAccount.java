
public class LAB6C_37_BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public LAB6C_37_BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static void main(String[] args) {

        LAB6C_37_BankAccount[] accounts = new LAB6C_37_BankAccount[3];

        accounts[0] = new LAB6C_37_BankAccount(1001, 5000.0, "Rohit Sharma");
        accounts[1] = new LAB6C_37_BankAccount(1002, 10000.0, "Virat Kohli");
        accounts[2] = new LAB6C_37_BankAccount(1003, 7500.0, "M.S Dhoni");

        accounts[0].deposit(1000);
        accounts[1].withdraw(2000);
        accounts[2].deposit(500);
        accounts[2].withdraw(10000);

        for (LAB6C_37_BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getAccountHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: " + acc.checkBalance());
            System.out.println();
        }
    }
}
