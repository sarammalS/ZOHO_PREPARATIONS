/*Design a class named `BankAccount` that uses the concept of encapsulation. 
The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields.
 Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.*/
 import java.util.*;
 class BankAccount{
    private long accno;
    private String name;
    private double balance;
    public long getacc(){
        return accno;
    }
    public String getname(){
        return name;
    }
    public double getbalance(){
        return balance;
    }
    public void setacc(long accno){
        this.accno=accno;
        
    }
    public void setname(String name){
        this.name=name;
    }
    public void setbal(double balance){
        this.balance=balance;
    }
    public void deposit(double  amt){
        balance+=amt;

        System.out.println("Amount depostied" );
        System.out.println("Total:"+balance);
    }
    public void withdraw(double amt){
        if(amt<=balance){
            balance-=amt;
            System.out.println("Withdraw amount:"+amt+"\n Total:"+balance);
        }
        else{
            System.out.println("Insufficient");
        }
    }

 }
 class Q5{
public static void main(String[] args){
    BankAccount b= new BankAccount();
    Scanner s= new Scanner(System.in);
    System.out.println("Enter a name");
    b.setname(s.nextLine());
    System.out.println("Enter a acc num");
    b.setacc(s.nextLong());
    s.nextLine();
    System.out.println("Enter a balance amount ");
    b.setbal(s.nextDouble());
    s.nextLine();
    System.out.println("Enter a choice: \n1.Deposit\n 2. Withdraw");
    int i=s.nextInt();
    if(i==1){
    System.out.println("Enter amount to be deposit:");
    double amt= s.nextDouble();
    b.deposit(amt);
    
    }
    else if(i==2){
    System.out.println("Enter amount to be withdraw");
    double amt =s.nextDouble();

    b.withdraw(amt);
    }else{
        System.out.println("Invlaid choices");
    }
      System.out.println("\n ACCOUNT SUMMARY ");
        System.out.println("Name: " + b.getname());
        System.out.println("Account No: " + b.getacc());
        System.out.println("Final Balance: " + b.getbalance());

 }
}
 /*Enter a name
sara
Enter a acc num
3452
Enter a balance amount 
3112
Enter a choice: 
1.Deposit
 2. Withdraw
1
Enter amount to be deposit:
342
Amount depostied
Total:3454.0

 ACCOUNT SUMMARY 
Name: sara
Account No: 3452
Final Balance: 3454.0 */