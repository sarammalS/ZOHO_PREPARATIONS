/*2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.
‌*/
import java.util.*;

class Q2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // a. Append the specified element to the end of a linked list
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        // b. Iterate through all elements in a linked list
        System.out.println("Iterate using Iterator:");
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // f. Insert elements into the linked list at the first and last position
        ll.addFirst(6);
        ll.addLast(7);
        System.out.println("After adding at first and last:");
        for (Integer i : ll) {
            System.out.println(i);
        }

        // c. Iterate through all elements in a linked list starting at the specified position
        System.out.println("Iterate from index 1:");
        ListIterator<Integer> lit = ll.listIterator(1);
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        // d. Iterate a linked list in reverse order
        System.out.println("Reverse order:");
        ListIterator<Integer> lit2 = ll.listIterator(ll.size());
        while (lit2.hasPrevious()) {
            System.out.println(lit2.previous());
        }

        // e. Insert the specified element at the specified position
        ll.add(2, 99); // inserting 99 at index 2
        System.out.println("After inserting at index 2:");
        System.out.println(ll);

        // i. Insert some elements at the specified position
        ll.add(1, 88); // inserting 88 at index 1
        ll.add(3, 77); // inserting 77 at index 3
        System.out.println("After inserting at multiple positions:");
        System.out.println(ll);

        // j. Get the first and last occurrence of the specified element
        ll.add(3);
        ll.add(4);
        ll.add(3);
        ll.add(4);
        ll.add(3);
        ll.add(4);
        int first = ll.indexOf(3);
        int last = ll.lastIndexOf(3);
        System.out.println("First occurrence of 3: " + first);
        System.out.println("Last occurrence of 3: " + last);

        // g. Insert the specified element at the front of a linked list
        ll.addFirst(0);
        System.out.println("After inserting 0 at the front:");
        System.out.println(ll);

        // h. Insert the specified element at the end of a linked list
        ll.addLast(9);
        System.out.println("After inserting 9 at the end:");
        System.out.println(ll);
    }
}
