/**1. Illustrate the concept-Encapsulation with the Payment Gateway System.
 * [The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. 
 * Provide appropriate public getter and setter methods to access and modify these details securely. 
 * Also include a method to display the transaction summary.]
‌*/
class Payment{
    private int transaction_ID;
    private String name;
    private int amt;
    private String paymentmethod;
    private String status;

    public int getid(){
        return transaction_ID;
    }
    public String getname(){
      return name;
    }
    public int getamt(){
        return amt;
    }
    public String getpaymentmethod(){
        return paymentmethod;
    }
    public String getstatus(){
        return status;
    }

    public void setid(int id){
        transaction_ID=id;
    }
    public void setname(String name){
          this.name=name;
    }
    public void setamt(int amt){
          this.amt=amt;
    }

    public void setpayment(String paymentmethod){
          this.paymentmethod=paymentmethod;
    }
    public void setsts(String status){
        this.status=status;
    }

public void display(){
    System.out.println("Payment gateway");
        System.out.println("Transcation id:"+getid());
        System.out.println("name:"+getname());
        System.out.println("amount:"+getamt());
        System.out.println("payment:"+getpaymentmethod());
        System.out.println("status:"+getstatus());
        

}
}
class Q2{
    public static void main(String args[]){
        Payment p= new Payment();
        p.setid(1);
        p.setname("Sara");
        p.setamt(4000);
        p.setpayment("upi");
        p.setsts("suceess");
        p.display();

    }
}