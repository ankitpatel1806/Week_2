import java.util.ArrayList;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.accountNumber + " Balance: " + account.getBalance());
        }
    }
}

class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Customer customer, Account account) {
        customer.openAccount(account);
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer = new Customer("Zoro");
        bank.addCustomer(customer);

        Account account = new Account("7895", 5000.0);
        bank.openAccount(customer, account);

        customer.viewBalance();  // Displays account details
    }
}
