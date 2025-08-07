Sarammal <sarammalbca2003@gmail.com>
	
Aug 3, 2025, 6:42 PM (14 hours ago)
	
to me
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 4. Write a Java program to,
// a. create a new tree set, add some colours (string) and print out the tree set.
// b. iterate through all elements in a tree set.
// c. add all the elements of a specified tree set to another tree set.
// d. create a reverse order view of the elements contained in a given tree set.
// e. get the first and last elements in a tree set.
// f. clone a tree set list to another tree set.
// g. get the number of elements in a tree set.
// h. compare two tree sets.
// Create a TreeSet that stores a set of numbers,  
// i. find the numbers less than 7 in a tree set.
// j. get the element in a tree set which is greater than or equal to the given element.
// k. get the element in a tree set which is less than or equal to the given element.
// l. get the element in a tree set which is strictly greater than or equal to the given element.
// m. get an element in a tree set which is strictly less than the given element.
// n. retrieve and remove the first element of a tree set.
// o. retrieve and remove the last element of a tree set.
// p. remove a given element from a tree set.
import java.util.*;
class Q4{
   
    public static void main(String[] args) {
       SortedSet<String> set= new TreeSet<>();
       set.add("Blue");
       set.add("Black");
       set.add("Purple");
       for(String i:set){
           System.out.println(i);
       }
       System.out.println(set);
       
       NavigableSet<String> set1= new TreeSet<>(set);
       System.out.println(set1);
         
       NavigableSet<String> Rset1= set1.descendingSet();
       System.out.println(Rset1);
       System.out.println("first element:"+set1.first());
       System.out.println("Last element:"+set1.last());
       System.out.println("Size:"+set1.size());
       System.out.println(set.equals(set1));
         NavigableSet<Integer> nset= new TreeSet<>();
         nset.add(1);
         nset.add(2);
         nset.add(3);
         nset.add(8);
         nset.add(9);
         nset.add(7);
         System.out.println(nset);
         
          System.out.println("Less than 7: "+nset.headSet(7));
            System.out.println("higher than 7: "+nset.tailSet(7));
         
         System.out.println("Less than 7: "+nset.lower(7));
            System.out.println("higher than 7: "+nset.higher(7));
           
         System.out.println("Original Set"+nset);
          System.out.println("Removes First element: "+nset.pollFirst());
            System.out.println("Last elemnts: "+nset.pollLast());
         
         System.out.println("Original Set"+nset);
       boolean removes= nset.remove(7);
       
       System.out.println("Removes 7 "+removes);
       System.out.println("After 7 removes:"+nset);
       
       
     
    }
}