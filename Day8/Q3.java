/** Develop a Java program which illustrates the usage of Comparable Interface. */
import java.util.*;
class Products implements  Comparable<Products>{
    String pname;
    int pid;
    double price;
    Products(  String pname,
    int pid,
    double price){
        this.pname=pname;
        this.pid=pid;
        this.price=price;
    }
    public int compareTo(Products s){
        return this.pname.compareTo(s.pname);
    }

    public String toString(){
        return "Productname :"+pname +" productsid: "+pid+" Price: "+price;
    }
}
class Q3{
    public static void main(String[] args){
        Products[] p1= {new Products("Pen",50,10.0),
        new Products("Eraser",70,20.0),
        new Products("charger",100,200.0)};
        Arrays.sort(p1);

      
       for(Products i:p1){
        System.out.println(i.toString());
       }
        
    }
}