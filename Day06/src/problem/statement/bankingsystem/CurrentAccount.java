package problem.statement.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.05; // Fixed 5% interest rate for CurrentAccount
    }

    // Implementing Loanable interface methods
    @Override
    public void applyForLoan() {
        System.out.println("Loan application for Current Account (" + getAccountNumber() + ") is under review.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() + overdraftLimit >= 10000; // Eligibility based on overdraft limit and balance
    }
}
