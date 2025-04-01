import java.util.Scanner;
public class movie
{
	private String name;
	private int seat;
	private int price;
	
	public movie(String name,int seat,int price)
	{
		this.name=name;
		this.seat=seat;
		this.price=price;
	}
	public void display(){
		System.out.println("name: "+name);
		System.out.println("seat: "+seat);
		System.out.println("price"+price);
	}
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{

        System.out.print("Enter Movie Name: ");
        String name = scanner.nextLine();
		scanner.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = scanner.nextInt();
		scanner.nextLine();

        System.out.print("Enter Ticket Price: ");
        int price = scanner.nextInt();
		scanner.nextLine();

        movie movie1 = new movie(name, seat, price);

        System.out.println("\nTicket Details:");
        movie1.display();
		}

        
    }
}
		
	

		

