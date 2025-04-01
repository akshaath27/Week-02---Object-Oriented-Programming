import java.util.Scanner;
public class atm {
    private String accountholder;
    private int accountnumber;
    private int balance;

    public atm(String accountholder, int accountnumber, int balance) {
        this.accountholder = accountholder;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("the balance" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String accountholder = scanner.nextLine();
        int accountnumber = scanner.nextInt();
        int balance = scanner.nextInt();
        int amount = scanner.nextInt();
        atm atm1 = new atm(accountholder, accountnumber, balance);
        System.out.println("deposit");
        atm1.deposit(amount);
        System.out.println("withdraw");
        atm1.withdraw(amount);
        System.out.println("final");
        atm1.display();
    }
}








