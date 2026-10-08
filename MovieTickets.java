import java.util.Scanner;

class MovieTicket {

    // Data members
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    // Parameterized Constructor
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Method to calculate total ticket amount
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Method to calculate discount
    double calculateDiscount() {
        if (numberOfTickets >= 4) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    // Method to calculate final amount
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Method to display the complete bill
    void displayBill() {
        System.out.println("\n=================================");
        System.out.println("       CINEMA TICKET BILL");
        System.out.println("=================================");

        System.out.println("Movie Name       : " + movieName);
        System.out.printf("Ticket Price     : %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);

        System.out.println("---------------------------------");

        System.out.printf("Total Amount     : %.2f%n", calculateTotal());
        System.out.printf("Discount         : %.2f%n", calculateDiscount());
        System.out.printf("Final Amount     : %.2f%n", calculateFinalAmount());

        System.out.println("------------------------------------");
        System.out.println("       THANK YOU! ENJOY THE MOVIE");
        System.out.println("------------------------------------");
    }
}

public class MovieTickets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = sc.nextInt();

        // Creating MovieTicket object using constructor
        MovieTicket ticket = new MovieTicket(
                movieName, ticketPrice, numberOfTickets
        );

        // Displaying the complete bill
        ticket.displayBill();

        sc.close();
    }
}