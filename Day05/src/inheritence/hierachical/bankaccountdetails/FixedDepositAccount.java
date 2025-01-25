package inheritence.hierachical.bankaccountdetails;

public class FixedDepositAccount extends BankAccount {
    private int tenure;

    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}