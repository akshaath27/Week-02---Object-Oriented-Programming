interface Loanable{
    void applyForLoan();
    double calculateLoanEligiblity();
}
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String name;
    private double balance;

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0)
        {
         balance+=amount;
            System.out.println(name+ " deposited"+ amount);
        }
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println(name+"  withdrew "+amount);
        }
        else {
            System.out.println("insuffient amount");
        }
    }
    public abstract double calculateIntrest();
    public void displayAccountDetails()
    {
        System.out.println("account number : "+accountNumber);
        System.out.println("holder name:   "+name);
        System.out.println("balance  :  "+balance);
        System.out.println("interest  :" +calculateIntrest());
        System.out.println("loan eligibility:"+calculateLoanEligiblity());
        System.out.println("--------------------------------");

    }
}
class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public double calculateIntrest() {
        return getBalance()*0.04;
    }

    @Override
    public void applyForLoan() {
        System.out.println(getName()+"applied for a laon" +calculateLoanEligiblity());

    }

    @Override
    public double calculateLoanEligiblity() {
        return getBalance()*5;
    }
}
class CurrentAmount extends BankAccount
{
    public CurrentAmount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public double calculateIntrest() {
        return getBalance()*0.02;
    }

    @Override
    public void applyForLoan() {
        System.out.println(getName()+"applied for loan"+calculateLoanEligiblity());
    }

    @Override
    public double calculateLoanEligiblity() {
        return getBalance()*10;
    }
}
class bankingsystem{
    public static void main(String[]args){
        BankAccount acc1=new SavingAccount("sbi12345","akshaath",10000.0);
        BankAccount acc2=new CurrentAmount("sbi34567","abi",19000.0);
        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.applyForLoan();
        acc1.displayAccountDetails();

        acc2.deposit(1000);
        acc2.withdraw(2000);
        acc2.applyForLoan();
        acc2.displayAccountDetails();


    }
}