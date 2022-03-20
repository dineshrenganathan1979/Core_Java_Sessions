package Java_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {


		//Map<String, String> mp = new  HashMap<String, String>();
		//Map<Integer, String> mp = new HashMap<Integer, String>();
		Map<Object, String> mp = new TreeMap<Object, String>();
		mp.put(1121, null); //Mulitple null values are supported in Hashmap
		mp.put(1123, "Arun");
		mp.put(1150, "Ganesh");
		mp.put(1167, null);
		mp.put(1168, "Arun"); //In Hashmap Duplicate Values are allowed but the Key should be Unique also only one Null Key is allowed.
		mp.put(1168, "Ganesh");
		//mp.put(null, null);
		//mp.put(null, null); //more than one null key is not allowed in Hashmap
		
		//Iterating or Retrieve the entries in HashMap using Enhanced for loop
//		
//		for(Entry e: mp.entrySet()) {
//			//System.out.println("The Entry is: "+ e);
//			System.out.println("The Key is: "+e.getKey()+" and the Values is: "+e.getValue());
//		}
     
		//Using Iterator for Retrieving the entries in HashMap
		 Set st = mp.entrySet(); //Duplicate values
		 Iterator itr = st.iterator();
		 while(itr.hasNext()) {
		//	 System.out.println("The Entry is: "+itr.next());
			 Entry e = (Entry) itr.next();
			 System.out.println("The Key is: "+e.getKey()+" and the Values is: "+e.getValue());		
		 }
	}

}
