
package travels;
import travels.Ticket;
public class User{
    public String name;
    public String phone;
    public String source;
    public String destination1;
    public String date;
    public User(String name,
    String phone,
    String source,
    String destination1,
    String date){
        this.name=name;
        this.phone=phone;
        this.source=source;
        this.destination1=destination1;
        this.date=date;
    }
    public void book(int ticketid,String destination,Double fare){
         System.out.println("Name:"+name);
        System.out.println("Phone:"+phone);
        System.out.println("source:"+source);
        System.out.println("Date:"+date);
        Ticket t= new Ticket(ticketid,destination,fare);

       

        t.display1();

    }


}