import java.util.Scanner;
class BankAccount {
    // Attributes of the bank account
    String accountHolder;
    String accountNumber;
    double balance;
    // Constructor to initialize account details
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    // Method to display balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}
public class BankAccountMain {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);
        // Taking account holder details
        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        // Creating BankAccount object
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);
        // Performing operations
        account.deposit(1000);
        account.withdraw(500);
        account.displayBalance();
        // Close the scanner
        scanner.close();
    }
}
