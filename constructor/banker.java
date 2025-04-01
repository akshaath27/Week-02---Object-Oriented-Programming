public class banker {
    static String bankname="SBI";
    static int count=0;
    String accountname;
    final int accountnumber;


    public banker(int accountnumber, String accountname) {
        this.accountnumber = accountnumber;
        this.accountname = accountname;
        count++;
    }
    static void  getTotalAccounts(){
        System.out.println("the total number of accounts"+count);
    }
    public void displaydetails(){
        if(this instanceof banker){
            System.out.println("bankname: "+bankname);
            System.out.println("account name: "+accountname);
            System.out.println("account number: "+accountnumber);
        }
    }
    public static void main(String[]args)
    {
        banker banker1=new banker(3003,"ash");
        banker banker2=new banker(500052,"dauf");
        banker1.displaydetails();
        banker2.displaydetails();
    }
}
