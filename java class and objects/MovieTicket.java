import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " at seat " + seatNumber);
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			

        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
		scanner.nextLine();

        System.out.print("Enter Seat Number: ");
        int seatNumber = scanner.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        System.out.println("\nBefore Booking:");
        ticket.displayTicketDetails();

        System.out.println("\nBooking Ticket...");
        ticket.bookTicket();

        System.out.println("\nAfter Booking:");
        ticket.displayTicketDetails();

        
		}
    }
}