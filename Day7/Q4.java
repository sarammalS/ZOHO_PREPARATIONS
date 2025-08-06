// Q4. Design a Java Ticket Booking System using polymorphism
// Base class: Ticket with bookTicket() method
// Subclasses: Bus, Train, Flight each override bookTicket()

interface  Ticket {
    abstract void bookTicket();
}

class Bus implements Ticket {
    
    void bookTicket() {
        System.out.println("Bus ticket booked. Seat assigned.");
    }
}

class Train implements Ticket {
   
    void bookTicket() {
        System.out.println("Train ticket booked. Coach allocated.");
    }
}

class Flight implements Ticket {
    
    void bookTicket() {
        System.out.println("Flight ticket booked. Boarding pass issued.");
    }
}

 class Q4{
    public static void main(String[] args) {
        Ticket ticket;

        ticket = new Bus();
        ticket.bookTicket();

        ticket = new Train();
        ticket.bookTicket();

        ticket = new Flight();
        ticket.bookTicket();
    }
}