public class BankAccount {
    int accountNumber;
    int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displaybankdetails()
    {
        System.out.println("Account number : "+accountNumber);
        System.out.println("balance : "+balance);
    }
}
class SavingAccount extends BankAccount
{
    double intrestRate;

    public SavingAccount(int accountNumber, int balance, double intrestRate) {
        super(accountNumber, balance);
        this.intrestRate = intrestRate;
    }

    @Override
    public void displaybankdetails() {
        super.displaybankdetails();
        System.out.println("this is savings account");
        System.out.println("intrest Rate: "+intrestRate+"%");
    }
}
class CheckingAccount extends BankAccount
{
    int withdrawLimit;

    public CheckingAccount(int accountNumber, int balance,int withdrawLimit) {
        super(accountNumber, balance);
        this.withdrawLimit=withdrawLimit;
    }

    @Override
    public void displaybankdetails() {
        super.displaybankdetails();
        System.out.println("this is checking account");
        System.out.println("the withdraw limit: "+withdrawLimit);
    }
}
class banking
{
    public static void main(String args[])
    {
        SavingAccount savings=new SavingAccount(121221,60000,6.0);
        CheckingAccount checking=new CheckingAccount(234245,80000,8000);
        savings.displaybankdetails();
        checking.displaybankdetails();
    }
}
