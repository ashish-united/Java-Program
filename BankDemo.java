// BankAccount Class

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " Rs");
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " Rs");
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance + " Rs");
    }
}

// SavingsAccount
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Less Balance.");
        } else {
            super.withdraw(amount);
        }
    }
}

// CurrentAccount
class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < -5000) {
            System.out.println("Withdrawal denied! Overdraft limit of 5000Rs exceeded.");
        } else {
            super.withdraw(amount);
        }
    }
}

// Main Class
public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);
        sa.deposit(200);
        sa.withdraw(650);
        sa.displayBalance();

        CurrentAccount ca = new CurrentAccount(1000);
        ca.withdraw(5500);
        ca.displayBalance();
    }
}