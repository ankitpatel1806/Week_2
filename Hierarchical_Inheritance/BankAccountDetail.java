class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Bank Account");
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure;

    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
public class BankAccountDetail {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", 5000);
        SavingsAccount savingsAccount = new SavingsAccount("54321", 10000, 4.5);
        CheckingAccount checkingAccount = new CheckingAccount("67890", 3000, 1000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("11223", 20000, 5);
        bankAccount.displayAccountType();
        savingsAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fixedDepositAccount.displayAccountType();
    }
}
