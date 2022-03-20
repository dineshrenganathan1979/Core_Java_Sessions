import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Get_Frequency_and_Index_Position_of_duplicate_elements {
	
	/* Logic
	 * =====
	 * 1. First convert Arrays to List using Arrays.asList(arr);
	 * 2. Create temporary HashSet to store unique elements of List
	 * 3. Iterate through List using traditional for-loop
	 * 4. Try to add each elements from List to Set using add() method of Set
	 * 5. If return value of add() method is false then it is duplicate
	 * 6. We make then print duplicate element along with its index-position
	 *  
	 * 
	 */

	public static void main(String[] args) {

		String string ="Hello Dinesh Welcome To India Dinesh Welcome To";
		
		String[] stringArray = string.split(" ");
		
		List<String> duplicateValuesList = new ArrayList(Arrays.asList(stringArray));
		
		Set<String> setValues = new HashSet();
		
		for(int i=0; i<duplicateValuesList.size(); i++) {
			
			boolean flagForDuplicates = setValues.add(duplicateValuesList.get(i));
			
			if(! flagForDuplicates) {
				System.out.println("Found the Duplicate Value: "+duplicateValuesList.get(i)+ " at index position: "+i);
	     	}
		} 

	}

}
