/*5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.
‌*/
import java.util.*;

class Q5 {
    public static void main(String[] args) {
        // 1. Create and add elements
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("blue");
        pq.add("black");
        pq.add("purple");
        System.out.println("Original PriorityQueue: " + pq);

        // 2. Iterate through elements
        System.out.println("Iterating through elements:");
        Iterator<String> it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 3. Add all elements to another priority queue
        PriorityQueue<String> pq1 = new PriorityQueue<>(pq);
        System.out.println("New PriorityQueue (copied): " + pq1);

        // 4. Insert a given element
        pq1.add("red");
        System.out.println("After inserting 'red': " + pq1);

        // 5. Remove all elements
        pq1.clear();
        System.out.println("After clearing pq1: " + pq1);

        // 6. Count elements
        System.out.println("Size of pq: " + pq.size());

        // 7. Compare two priority queues
        PriorityQueue<String> pq2 = new PriorityQueue<>(pq);
        boolean areEqual = new HashSet<>(pq).equals(new HashSet<>(pq2));
        System.out.println("Are pq and pq2 equal? " + areEqual);

        // 8. Retrieve first element
        System.out.println("First element (peek): " + pq.peek());

        // 9. Retrieve and remove first element
        System.out.println("Retrieve and remove (poll): " + pq.poll());
        System.out.println("After poll: " + pq);

        // 10. Convert to array
        String[] st = pq.toArray(new String[0]);
        System.out.println("Converted to array:");
        for (String i : st) {
            System.out.println(i);
        }
    }
}
