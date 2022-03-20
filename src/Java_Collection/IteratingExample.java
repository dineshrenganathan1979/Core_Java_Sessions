package Java_Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratingExample {

	public static void main(String[] args) {
		// Create and populate the list
        Collection<String> list = new LinkedList<>();
 
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("is");
        list.add("a");
        list.add("CS");
        list.add("Students");
        list.add("Portal");
 
        // Displaying the list
        System.out.println("The list is: " + list);
 
        // Create an iterator for the list
        // using iterator() method
        Iterator<String> iter = list.iterator();
 
        // Displaying the values after iterating
        // through the list
        System.out.println("\nThe iterator values" + " of list are: ");
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }

	}

}
