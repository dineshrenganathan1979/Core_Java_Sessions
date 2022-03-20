package Java_Collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {

		Map<Object, String> mp = new Hashtable<Object, String>();
//	    mp.put(1121, null); // Null Key as well as Null Values are not allowed in HashTable
		mp.put(1123, "Arun");
		mp.put(1150, "Ganesh");
	//	mp.put(1167, null);
		mp.put(1168, "Arun"); //In HashTable Duplicate Values are allowed but the Key should be Unique and not null.
		mp.put(1168, "Ganesh");
//		mp.put(null, "Kumar"); // Null Key as well as Null Values are not allowed in HashTable
		//mp.put(null, null);
		
//	 for(Entry e: mp.entrySet()) {
//	//	 System.out.println(e); // Printing the Entries
//		 System.out.println("The Key is: "+e.getKey()+" and The Value is : "+e.getValue());
//		 
//	 }
		
		
	 Set st = mp.entrySet(); //Duplicate values
	 Iterator itr = st.iterator();
	 while(itr.hasNext()) {
	//	 System.out.println("The Entry is: "+itr.next());
		 Entry e = (Entry) itr.next();
		 System.out.println("The Key is: "+e.getKey()+" and the Values is: "+e.getValue());		
	 }
	}

}
