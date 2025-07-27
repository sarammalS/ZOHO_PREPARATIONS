// Q4. Design a Java Ticket Booking System using polymorphism
// Base class: Ticket with bookTicket() method
// Subclasses: Bus, Train, Flight each override bookTicket()

abstract class Ticket {
    abstract void bookTicket();
}

class Bus extends Ticket {
    @Override
    void bookTicket() {
        System.out.println("Bus ticket booked. Seat assigned.");
    }
}

class Train extends Ticket {
    @Override
    void bookTicket() {
        System.out.println("Train ticket booked. Coach allocated.");
    }
}

class Flight extends Ticket {
    @Override
    void bookTicket() {
        System.out.println("Flight ticket booked. Boarding pass issued.");
    }
}

public class Q4 {
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
