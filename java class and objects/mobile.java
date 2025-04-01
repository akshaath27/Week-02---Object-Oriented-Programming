import java.util.Scanner;
public class mobile
{
	private String brand;
	private int model;
	private int price;
	
	public mobile(String brand,int model,int price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void display()
	{
		System.out.println("the brand of mobile: "+brand);
		System.out.println("the model of mobile: "+model);
		System.out.println("the price of mobile: "+price);
	}
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		String brand=scanner.nextLine();
		int model=scanner.nextInt();
		int price=scanner.nextInt();
		mobile mobile1=new mobile(brand,model,price);
		System.out.println("mobile info");
		mobile1.display();
	}
}

		

