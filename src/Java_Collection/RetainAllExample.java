package Java_Collection;

import java.util.Collection;
import java.util.HashSet;

public class RetainAllExample {

	public static void main(String[] args) {

		 Collection<String> set1 = new HashSet<String>();
		 
	        // Populating arrset1
	        set1.add("arun");
	        set1.add("ravi");
	        set1.add("arun");
	        set1.add("kumar");
	        set1.add("mahesh");
	        
	        //Display the Unique values in the Hashset
	        System.out.println("Display the Unique values in the Hashset: ");
	        System.out.println(set1);
	        
	        // Creating another object of HashSet<Integer>
	        Collection<String> set2 = new HashSet<String>();
	        set2.add("arun");
	        set2.add("ravi");
	        set2.add("arjun");
	        set2.add("aravind");
	        
	        System.out.println("Displaying the Values after the RetailAll Method in the Hashset: ");
	        set2.retainAll(set1);
	        
	        System.out.println(set2);
	}

}
