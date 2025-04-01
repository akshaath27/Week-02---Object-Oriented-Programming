import java.util.Scanner;
public class item{
	private double code;
	private String name;
	private double price;
	
	
	public item(double code,String name,double price){
		this.code=code;
		this.name=name;
		this.price=price;
		
	}
	public double calculatecost(int quantity){
		return quantity*price;
	}
	
	public void display(){
		System.out.println("code: "+code);
		System.out.println("name: "+name);
		System.out.println("price"+price);
	}
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		double code=scanner.nextDouble();
		scanner.nextLine();
		String name=scanner.nextLine();
		
		double price=scanner.nextDouble();
		int quantity=scanner.nextInt();
		item item1=new item(code,name,price);
		System.out.println("enter item1");
		item1.display();
		System.out.println("the cost of items");
		System.out.println("the price of items"+item1.calculatecost(quantity));
		
	}
}

		
		
		
		
		
		


		
		
		
		
		
		

