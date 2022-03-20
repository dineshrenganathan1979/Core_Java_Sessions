import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ShuffleStringOne {

	public static void main(String[] args) {
		ArrayList<String>  list = new ArrayList<String>();
    	list.add("cat");
    	list.add("dog");
    	list.add("cow");
    	list.add("bull");
   		list.add("snake");
    	list.add("goat");
    	// List before shuffling
   		System.out.println("Original List : \n" + list);

    	// Second parameter will be Random()
    	Collections.shuffle(list, new Random());
    	System.out.println("Shuffled List with Random() : \n" + list);

   		// Second parameter will be Random(2).
   		Collections.shuffle(list, new Random(2));
    	System.out.println("Shuffled List with Random(2) : \n" + list);

    	// Second parameter will be Random(4).
    	Collections.shuffle(list, new Random(4));
    	System.out.println("Shuffled List with Random(4) : \n" + list);

	}

}
