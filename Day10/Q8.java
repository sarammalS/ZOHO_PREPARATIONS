/*8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).*/
import java.util.*;

class Account {
    int accnum;
    String holdername;
    double amt; // Original amount
    Double balance;  // Autoboxed balance
    Double interest; // Autoboxed interest

    Account(int accnum, String holdername, double amt) {
        this.accnum = accnum;
        this.holdername = holdername;
        this.amt = amt;

        // Autoboxing: assigning primitive to Double
        this.balance = amt;
    }

    public void applyInterest() {
        // Manual boxing
        Double rate = Double.valueOf(0.05);

        // Autounboxing happens during arithmetic
        interest = balance * rate;

        // Update balance
        balance = balance + interest;
    }

    public void displayDetails() {
        System.out.println("Holder Name: " + holdername);
        System.out.println("Account Number: " + accnum);
        System.out.println("Original Balance: " + amt);
        System.out.println("Interest Applied: " + interest);
        System.out.println("New Balance: " + balance); // Autounboxed to primitive when printing
        System.out.println("--------------------------------");
    }
}

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Account> arr = new ArrayList<>();
        arr.add(new Account(1001, "Sara", 4000.0));
        arr.add(new Account(1002, "Sara1", 3000.0));
        arr.add(new Account(1003, "Sara2", 5000.0));

        for (Account acc : arr) {
            acc.applyInterest();
            acc.displayDetails();
        }
    }
}
