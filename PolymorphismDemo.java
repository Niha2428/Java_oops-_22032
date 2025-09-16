// Base class
class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // --- Method Overloading (Compile-time Polymorphism) ---
    void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited $" + amount + ". Balance: $" + balance);
    }

    void deposit(double amount, String source) {
        balance += amount;
        System.out.println(accountHolder + " deposited $" + amount + " via " + source + ". Balance: $" + balance);
    }

    void deposit(int amount, boolean cash) {
        balance += amount;
        System.out.println(accountHolder + " deposited $" + amount + (cash ? " in Cash." : " online.") + " Balance: $" + balance);
    }

    // --- Method to be overridden (Runtime Polymorphism) ---
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew $" + amount + ". Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal!");
        }
    }
}

//Child class (SavingsAccount) → Method Overriding
class SavingsAccount extends BankAccount {
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 5000) {
            System.out.println("Savings Account: Withdrawal limit exceeded (Max $5000).");
        } else {
            super.withdraw(amount);
        }
    }
}

//Child class (CurrentAccount) → Method Overriding
class CurrentAccount extends BankAccount {
    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void withdraw(double amount) {
        // Current account allows overdraft
        balance -= amount;
        System.out.println(accountHolder + " withdrew $" + amount + " (Overdraft allowed). Balance: $" + balance);
    }
}

//Main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== Method Overloading Example ===");
        BankAccount account1 = new BankAccount("Alice", 1000);
        account1.deposit(500);
        account1.deposit(1000, "UPI");
        account1.deposit(200, true);

        System.out.println("\n=== Method Overriding Example ===");
        BankAccount savings = new SavingsAccount("Bob", 6000);    // Upcasting
        BankAccount current = new CurrentAccount("Charlie", 3000); // Upcasting

        savings.withdraw(6000);  // Calls overridden method in SavingsAccount
        current.withdraw(6000);  // Calls overridden method in CurrentAccount
    }
}
