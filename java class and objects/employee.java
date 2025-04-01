import java.util.Scanner;
public class employee{
	private String name;
	private int id;
	private int salary;
	
	public employee(String name,int id ,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("name of employee "+name);
		System.out.println("id of employee "+id);
		System.out.println("salary of employee "+salary);
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		int id=scanner.nextInt();
		int salary=scanner.nextInt();
		
		employee employee1=new employee(name,id,salary);
		
		System.out.println("employee 1");
		employee1.display();
	}
}
	

		