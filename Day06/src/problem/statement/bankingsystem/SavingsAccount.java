package problem.statement.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Implementing Loanable interface methods
    @Override
    public void applyForLoan() {
        System.out.println("Loan application for Savings Account (" + getAccountNumber() + ") is under review.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Simple eligibility check
    }
}
