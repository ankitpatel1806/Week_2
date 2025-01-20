public class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "One Piece";
    // Static variable to count the total number of accounts
    private static int totalAccounts = 0;
    
    // Final variable to ensure accountNumber cannot be changed once assigned
    private final String accountNumber;
    
    // Instance variables
    private String accountHolderName;
    
    // Constructor
    public BankAccount(String accountHolderName) {
        // Resolving ambiguity in the constructor using 'this'
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateAccountNumber();  // Unique account number for each account
        totalAccounts++;  // Increment total accounts count
    }
    
    // Method to generate a unique account number (for demonstration purposes)
    private String generateAccountNumber() {
        return "AC" + (1000 + totalAccounts);
    }
    
    // Static method to get the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }
    
    // Instance method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        // Creating bank accounts
        BankAccount account1 = new BankAccount("Rononoa Zoro");
        BankAccount account2 = new BankAccount("Monkey D. Luffy");
        
        // Displaying account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        
        // Checking the total number of accounts
        BankAccount.getTotalAccounts();
        
        // Checking if the object is an instance of BankAccount
        if (account1 instanceof BankAccount) {
            System.out.println("account1 is an instance of BankAccount.");
        }
        
        if (account2 instanceof BankAccount) {
            System.out.println("account2 is an instance of BankAccount.");
        }
    }
}
