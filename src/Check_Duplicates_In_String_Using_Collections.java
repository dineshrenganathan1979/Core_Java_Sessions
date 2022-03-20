import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Check_Duplicates_In_String_Using_Collections {
	/*
	 * Logic:
	 * ======
	 * 1. Create a String consisting few duplicate element/objects
	 * 2. Convert String into String Array
	 * 3. First convert String Arrays into List
	 * 4. And then convert List into Set, as directly converting String Arrays to Set is not possible
	 * 5. Get length of String Arrays using length property of Arrays
	 * 6. Similarly get size of Set/HashSet object using size() method
	 * 7. Finally compare Arrays length with Set size using if-else statement
	 * 8. If String Arrays length is greater-than HashSet size then there are duplicate element/objects are present in original String Arrays
	 * 9. Else, there are NO duplicate present
	 * 
	 */
	

	public static void main(String[] args) {
  
		
		String string ="Hello Dinesh Welcome To India Dinesh Welcome To";
		
		String[] stringArray = string.split(" ");
	    // First convert to List
		List<String> duplicateValuesList = new ArrayList(Arrays.asList(stringArray));
		 // Then convert to Set
		Set<String> uniqueValues = new HashSet(duplicateValuesList);
		
		int lengthofArrayList = duplicateValuesList.size();
		int lenghtOfHashSet = uniqueValues.size();
		
		
		if(lengthofArrayList > lenghtOfHashSet) {
			System.out.println("Duplicates Values Found in the String");
		}
		else {
				System.out.println("No Duplicates Values Found in the String");
			}
	}

}
