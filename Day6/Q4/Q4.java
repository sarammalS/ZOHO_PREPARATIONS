/*4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.
‌*/
import travels.User;
import travels.Ticket;
import java.util.*;

public class Q4{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter name");
        String name=s.nextLine();
        System.out.println("Enter phone num");
        String phone=s.nextLine();
        System.out.println("Enter Source");
        String source=s.nextLine();
        System.out.println("Enter Destination");
        String destination= s.nextLine();
        System.out.println("Enter Date");
        String date= s.nextLine();
        System.out.println("get Fare");
        Ticket t= new Ticket();
        int id= t.getid();
        Double fare= t.getfare(destination);
        User u= new User(name,phone,source,destination,date);
        u.book(id,destination,fare);
    }
}
