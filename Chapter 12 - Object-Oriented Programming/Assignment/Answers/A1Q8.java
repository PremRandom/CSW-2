// Abstract Account class
abstract class Account {
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    // Abstract methods for deposit and withdrawal
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
        System.out.println("Deposited $" + amount + " with interest. New Balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// CurrentAccount subclass
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

// Main class
public class A1Q8 {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SAV123", 1000, 5.0);
        Account current = new CurrentAccount("CUR456", 500, 300);

        savings.displayAccountInfo();
        savings.deposit(500);
        savings.withdraw(1200);

        System.out.println();

        current.displayAccountInfo();
        current.deposit(300);
        current.withdraw(900);
    }
}
