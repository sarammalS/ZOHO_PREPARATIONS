/*
6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
‌*/
import java.util.*;
class Q7{
    public static void main(String[] args){
        Map<Integer,String> map= new TreeMap<>();
        map.put(1,"Mango");
        map.put(2,"Orange");
        map.put(3,"berry");
        System.out.println(map);
        for(Map.Entry<Integer, String> e:map.entrySet()){
            System.out.println(e.getKey()+"-"+e.getValue());
        }
        Map<Integer,String> map2= new TreeMap<>(map);
        System.out.println(map2);
        System.out.println(map2.containsKey(2));
         System.out.println(map2.containsValue("berry"));

        System.out.println(map2.keySet());
        map2.clear();
        System.out.println(map2);
          TreeMap<Integer, String> map3 = new TreeMap<>(Comparator.reverseOrder());

        map3.put(10, "Banana");
        map3.put(5, "Apple");
        map3.put(20, "Mango");
        System.out.println(map3);
        System.out.println(map3.firstKey()+":"+ map3.get(map3.firstKey()));
        
         System.out.println(map3.lastKey()+":"+map3.get(map3.lastKey()));
         System.out.println(map3.descendingMap());

    }
}