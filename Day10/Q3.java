/*3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
‌*/
Sarammal <sarammalbca2003@gmail.com>
	
Sun, Aug 3, 5:55 PM (15 hours ago)
	
to me
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 3. Write a Java program to,
// a. append the specified element to the end of a hash set.
// b. iterate through all elements in a hash list.
// c. get the number of elements in a hash set.
// d. empty the hash set.
// e. test a hash set is empty or not.
// f. clone a hash set to another hash set.
// g. convert a hash set to an array.
// h. convert a hash set to a tree set.
// i. convert a hash set to a List/ArrayList.
// j. compare two hash set.
import java.util.*;
class Q3{
    public static void main(String[] args) {
       HashSet<String> set= new HashSet<>();
       set.add("Apple");
       set.add("Mango");
       set.add("Strawberry");
       Iterator<String> it=set.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
       System.out.println(set);
       System.out.println(set.size());
       set.clear();
       System.out.println(set);
       System.out.println(set.isEmpty());
        HashSet<String> set1= new HashSet<>();
       set1.add("Apple");
       set1.add("Mango");
       set1.add("Strawberry");
       HashSet<String> set2= new HashSet<>(set1);
       System.out.println(set2);
       set2.add("Mango");
       System.out.println(set2);
       Set<String> tset= new TreeSet<>(set2);
       System.out.println(tset);
       String[] s= set2.toArray(new String[0]);
       for(Object  i:set2){
           System.out.println(i);
       }
       
    System.out.println("Are sets equal? " + set1.equals(set2)); // true
       ArrayList<String> arr= new ArrayList<>(set1);
       System.out.println(arr);
       
       
    }
}

