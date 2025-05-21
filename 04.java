class Ticket {
    private int ticketNumber;
    private String customerName;
    private int seatNumber;

    public Ticket(int ticketNumber, String customerName, int seatNumber) {
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void displayTicket() {
        System.out.println("Ticket Number: " + ticketNumber + ", Customer: " + customerName + ", Seat: " + seatNumber);
    }
}

class BookingSystem {
    private Ticket[] tickets;
    private int capacity = 10;

    public BookingSystem() {
        tickets = new Ticket[capacity];
    }

    public void bookTicket(int ticketNumber, String customerName, int seatNumber) {
        if (seatNumber < 1 || seatNumber > capacity) {
            System.out.println("Invalid seat number.");
            return;
        }

        if (tickets[seatNumber - 1] != null) {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return;
        }

        tickets[seatNumber - 1] = new Ticket(ticketNumber, customerName, seatNumber);
        System.out.println("Ticket booked successfully for seat " + seatNumber);
    }

    public void cancelTicket(int ticketNumber) {
        for (int i = 0; i < capacity; i++) {
            if (tickets[i] != null && tickets[i].getTicketNumber() == ticketNumber) {
                System.out.println("Ticket " + ticketNumber + " canceled.");
                tickets[i] = null;
                return;
            }
        }
        System.out.println("Ticket not found.");
    }

    public void displayAllTickets() {
        System.out.println("Current Bookings:");
        for (Ticket t : tickets) {
            if (t != null) {
                t.displayTicket();
            }
        }
    }
}

 class Main {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        
        system.bookTicket(1, "Alice", 1);
        system.bookTicket(2, "Bob", 2);
        system.bookTicket(3, "Charlie", 3);

    
        system.cancelTicket(2);

      
        system.bookTicket(4, "David", 2);

        
        system.displayAllTickets();
    }
}
