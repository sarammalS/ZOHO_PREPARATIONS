
package travels;
public class Ticket{
    int ticketid=100;
    String destination;
    Double fare;
    String[] destinations = {
        "UDT", "TPJ", "MAS", "CBE", "MDU",
        "TUP", "NCR", "MAD", "KTM", "TVR"
    };

    double[] fares = {
        500.0, 400.0, 100.0, 300.0, 350.0,
        450.0, 550.0, 600.0, 250.0, 380.0
    };
    public int getid(){
        return ticketid++;
    }
    public Ticket(){
        
    }
    Ticket( int id,String destination,double fare){
        ticketid=id;
        this.destination=destination;
        this.fare=fare;

    }
    public Double getfare(String destination){
        for(int i=0;i<destinations.length;i++){
            if(destinations[i].equalsIgnoreCase(destination)){
                return fares[i];
            }
        }
        return 0.0;
    }
    public void display1(){
        System.out.println("Ticket Information");
        System.out.println("Ticketid"+ticketid);
        System.out.println("Destination:"+destination);
        System.out.println("Fare: "+fare);
        
    }
    
}