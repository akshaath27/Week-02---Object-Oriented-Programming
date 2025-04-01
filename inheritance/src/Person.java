interface Worker{
    void performDuties();
}
public class Person {
     String name;
     int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayinfo()
    {
        System.out.println("name  :"+name);
        System.out.println("ID  :"+id);
    }
}

class Chef extends Person implements Worker
{
    String speciality;
    public Chef(String name,int id,String speciality){
        super(name,id);
        this.speciality=speciality;
}
public void performDuties()
{
    System.out.println(name+"is cooking"+speciality+"dishes");
}
public void displaydetails()
{
    displayinfo();
    System.out.println("speciality: "+speciality);
    performDuties();
}
}
class Waiter extends Person implements Worker{
    int tableassigned;

    public Waiter(String name, int id, int tableassigned) {
        super(name, id);
        this.tableassigned = tableassigned;
    }

    @Override
    public void performDuties() {

        System.out.println(name+"is serving"+tableassigned+"tables");
    }
    public void displaydetails()
    {
        displayinfo();
        System.out.println("tables assigned :"+tableassigned);
        performDuties();
    }
}
class Restuarant{
    public static void main(String[]args){
        Chef chef=new Chef("ash",27,"indian");
        Waiter waiter=new Waiter("ashhhh",34,7);
        chef.displaydetails();
        waiter.displaydetails();
    }
}



