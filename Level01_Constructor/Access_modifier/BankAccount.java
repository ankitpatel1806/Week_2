// BankAccount class
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    // Public method to access balance
    public double getBalance() {
        return balance;
    }
    // Public method to modify balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// SavingsAccount class demonstrating access to accountNumber and accountHolder
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("1001", "John Smith", 5000.0);
        savings.displayDetails();
        savings.setBalance(56220.2);  // Modifying balance using public method
        System.out.println("Updated Balance: " + savings.getBalance());
    }
}
