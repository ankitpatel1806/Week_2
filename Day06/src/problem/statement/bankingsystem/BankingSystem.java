package problem.statement.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        // Create account objects
        BankAccount savingsAccount = new SavingsAccount("SBI236547", "Hinata Shoyo", 100000, 4);
        BankAccount currentAccount = new CurrentAccount("KKB108218", "Tobio Kageyama", 30000, 5000);

        // List to hold different account types
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Polymorphism - processing different account types and calculating interest
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            // If the account is loanable, process loan eligibility
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan();
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
            }

            System.out.println(); // Separator between accounts
        }
    }
}