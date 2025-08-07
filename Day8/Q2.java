/* Develop a Java program which illustrates the usage of Comparator Interface*/

import java.util.*;
class Products{
    String pname;
    int pid;
    Double price;
    Products(String pname,
    int pid,
    Double price){
        this.pname=pname;
        this.pid=pid;
        this.price=price;
    }
    public String toString(){
        return "Productname :"+pname +" productsid: "+pid+" Price: "+price;
    }
}
class NameComparator implements Comparator<Products>{
    public int compare(Products p1, Products p2){
        return p1.pname.compareTo(p2.pname);
    }
}
class idComparator implements Comparator<Products>{
    public int compare(Products p1, Products p2){
        return Integer.compare(p1.pid,p2.pid);
    }
}
class priceComparator implements Comparator<Products>{
    public int compare(Products p1, Products p2){
        return p1.price.compareTo(p2.price);
    }
}
class Q2{
    public static void main(String[] args){
        Products[] Products1={
       new Products("pen",50,10.0),
         new Products("scale",70,20.0),
         new Products("eraser",90,5.0)};

        System.out.println("NAME SORITNG");
        Arrays.sort(Products1,new NameComparator());
        for(Products p:Products1){
            System.out.println(p.toString());
        }
        System.out.println("ID SORTING");
         Arrays.sort(Products1,new idComparator());
        for(Products p:Products1){
            System.out.println(p.toString());
        }

        System.out.println("PRICE SORTING");
         Arrays.sort(Products1,new priceComparator());
        for(Products p:Products1){
            System.out.println(p.toString());
        }
    
}
}
