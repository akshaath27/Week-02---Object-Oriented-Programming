import java.util.Scanner;
public class circle{
	private double radius;
	
	public circle(double radius){
		this.radius=radius;
	}
	public double calculatearea(){
		return 3.14*radius*radius;
	}
	public double calculatecircumference(){
		return 2*radius*radius;
	}
	public void display(){
		System.out.println("radius: "+radius);
		System.out.println("area: "+calculatearea());
		System.out.println("radius"+calculatecircumference());
	}
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		double radius=scanner.nextDouble();
		
		circle circle1=new circle(radius);
		System.out.println(" circle 1");
		circle1.display();
	}
}

		
		
		
		
		
		

