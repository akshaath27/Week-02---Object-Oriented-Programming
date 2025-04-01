import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void openAccount(String customerName, double initialBalance) {
        Account account = new Account(customerName, this, initialBalance);
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("Bank: " + name);
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }
}

class Account {
    private String customerName;
    private Bank bank;
    private double balance;

    public Account(String customerName, Bank bank, double balance) {
        this.customerName = customerName;
        this.bank = bank;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to " + customerName + "'s account at " + bank.getName());
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + customerName + "'s account at " + bank.getName());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Customer: " + customerName + " | Bank: " + bank.getName() + " | Balance: $" + balance);
    }
}

class jain {
    public static void main(String[] args) {
        Bank bank1 = new Bank("National Bank");
        Bank bank2 = new Bank("Community Bank");

        bank1.openAccount("Alice", 5000.0);
        bank1.openAccount("Bob", 3000.0);
        bank2.openAccount("Bob", 2000.0);

        bank1.displayAccounts();
        bank2.displayAccounts();
    }
}
