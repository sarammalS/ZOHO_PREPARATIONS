/*Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
class Customer
{
//Personal Details ...
// Few functions ...
}
class Account
{
// Account Detail ...
// Few functions ...
}
abstract class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
public abstract double getInterestRate();
public abstract double getWithdrawalLimit();
}
class SBI extends RBI
{
//Use RBI functionality or define own functionality.
}
class ICICI extends RBI
{
//Use RBI functionality or define own functionality
*/
// Customer.java
class Customer {
    String name;
    String phone;
    String email;

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void showDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}

// Account.java
class Account {
    long accountNumber;
    double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// RBI.java
abstract class RBI {
    Customer c;
    Account a;

    public RBI(Customer c, Account a) {
        this.c = c;
        this.a = a;
    }

    public void showCustomerAccountDetails() {
        c.showDetails();
        a.showAccount();
    }

    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();
}

// SBI.java
class SBI extends RBI {
    public SBI(Customer c, Account a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 5.5;
    }

    public double getWithdrawalLimit() {
        return 40000;
    }
}
// ICICI.java
class ICICI extends RBI {
    public ICICI(Customer c, Account a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 6.0;
    }

    public double getWithdrawalLimit() {
        return 50000;
    }
}


class PNB extends RBI {
    public PNB(Customer c, Account a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 5.0;
    }

    public double getWithdrawalLimit() {
        return 30000;
    }
}


public class Q1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Sara", "9876543210", "sara@email.com");
        Account account1 = new Account(1234567890123456L, 50000);

        RBI sbi = new SBI(customer1, account1);
        System.out.println("=== SBI BANK ===");
        sbi.showCustomerAccountDetails();
        System.out.println("Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: ₹" + sbi.getWithdrawalLimit());

        System.out.println();

        RBI icici = new ICICI(customer1, account1);
        System.out.println("=== ICICI BANK ===");
        icici.showCustomerAccountDetails();
        System.out.println("Interest Rate: " + icici.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: ₹" + icici.getWithdrawalLimit());
    }
}
