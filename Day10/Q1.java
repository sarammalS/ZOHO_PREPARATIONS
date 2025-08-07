/**1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.
‌ */
import java.util.*;
class Q1{
    public static void main(String[] args){
        ArrayList<String> arr= new ArrayList<>();
        arr.add("Blue");
        arr.add("Yellow");
        arr.add("Pink");
        arr.add("Red");
        arr.add("Orange");
        // Iterator<String> it= arr.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String i:arr){
            System.out.println(i);
        }
        // to insert an element into the array list at the first position.
        arr.add(0,"white");
        System.out.println("After insertn first pos");
        for(String i:arr){
            System.out.println(i);
        }
        //to retrieve an element (at a specified index) from a given array list.
        System.out.println("Reterive at index 3"+arr.get(3));
        // to update specific array element by given element
        arr.set(1,"Black");
         System.out.println("After Updation:");
        for(String i:arr){
            System.out.println(i);
        }
        //remove the third element from an array list.
        arr.remove(3);
        
        //to search an element in an array list.
        boolean s=arr.contains("Yellow");
        System.out.println(s);
        // to sort a given array list.
        Collections.sort(arr);
        System.out.println("Sort"+arr);
        //to copy one array list into another.
        ArrayList<String> copyarr= new ArrayList<>(arr);
        System.out.println("Copy Array:"+copyarr);
        //to shuffle elements in an array list.
        Collections.shuffle(arr);
        System.out.println("Shuffle:"+arr);
    }
}