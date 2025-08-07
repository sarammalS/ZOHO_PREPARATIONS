/*
7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.
‌
*/
import java.util.*;
class Q6{
    public static void main(String[] args){

        Map<Integer,String> map= new HashMap<>();
        map.put(1,"mango");
        map.put(2,"kiwi");
        map.put(3,"berry");
        System.out.println(map);
        System.out.println(map.size());
         Map<Integer,String> map2= new HashMap<>(map);
         System.out.println(map2);
         map2.clear();
         System.out.println(map2);
         System.out.println(map2.isEmpty());
         Map<Integer,String> mapshallow= new HashMap<>(map);
         System.out.println(mapshallow.containsKey(10));
         System.out.println(mapshallow.containsValue("kiwi"));
         System.out.println(map.entrySet());
         for(Map.Entry<Integer,String> e:map.entrySet()){

         System.out.println(e.getKey()+":"+e.getValue());
         }
         System.out.println(map.get(1));
         

    }

}