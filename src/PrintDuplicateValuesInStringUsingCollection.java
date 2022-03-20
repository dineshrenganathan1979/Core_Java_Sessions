import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateValuesInStringUsingCollection {
	
	/* Logic:
	 * =====
	 * 1. Create a String consisting few duplicate element/objects
	 * 2. Convert String into String Array
	 * 3. First convert String Arrays into List
	 * 4. add each element/objects of List one-by-one to Set using add(); method
	 * 5. add(); method returns false value, when we try to add duplicate element
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String string ="Hello Dinesh Welcome To India Dinesh Welcome To";
		String[] stringArray = string.split(" ");
		List<String> duplicateValuesList = new ArrayList(Arrays.asList(stringArray));
		Set<String> setValues = new HashSet();
		for(String value: duplicateValuesList ) {
			boolean flagForDuplicate = setValues.add(value);
			if(! flagForDuplicate) {
				System.out.println(value + " is duplicate element");
			}
		}
	
	}

}
