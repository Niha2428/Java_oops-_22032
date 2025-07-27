public class AccessModifier{

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.showPublicInfo();          // public method
        account.displayAccountDetails();   // method accessing all members internally

        Customer customer = new Customer();
        customer.accessAccount();
    }
}

// BankAccount class demonstrates all access modifiers
class BankAccount {
    public String accountHolder = "John Doe";       // public: accessible anywhere
    private double balance = 10000.00;              // private: accessible only inside this class
    protected String branchName = "Main Branch";    // protected: accessible in same package or subclass
    String accountType = "Savings";                 // default (package-private): accessible only in same package

    public void showPublicInfo() {
        System.out.println("Account Holder: " + accountHolder);
    }

    private void showPrivateInfo() {
        System.out.println("Balance (private): $" + balance);
    }

    protected void showProtectedInfo() {
        System.out.println("Branch Name: " + branchName);
    }

    void showDefaultInfo() {
        System.out.println("Account Type: " + accountType);
    }

    // Method that accesses all fields inside the same class
    public void displayAccountDetails() {
        System.out.println("\n--- Inside BankAccount class ---");
        showPrivateInfo();     // private
        showProtectedInfo();   // protected
        showDefaultInfo();     // default
    }

    public double getBalance() {
        return balance;
    }
}

// Customer class accessing members of BankAccount
class Customer extends BankAccount {

    public void accessAccount() {
        System.out.println("\n--- Customer Accessing Account Info ---");
        System.out.println("Account Holder (public): " + accountHolder);
        System.out.println("Branch (protected): " + branchName);
        System.out.println("Account Type (default): " + accountType);

        // Cannot access private directly:
        // System.out.println("Balance: " + balance);  //  Error
        System.out.println("Balance (via getter): $" + getBalance());
    }
}
