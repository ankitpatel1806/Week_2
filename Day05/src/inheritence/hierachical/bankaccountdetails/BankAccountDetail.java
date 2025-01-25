package inheritence.hierachical.bankaccountdetails;

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
