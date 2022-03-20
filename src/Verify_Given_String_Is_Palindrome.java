
public class Verify_Given_String_Is_Palindrome {

	/*
	 * A string is called a palindrome string if the reverse of that string is the
	 * same as the original string. For example, radar, level, etc...
	 * using for loop and if statement
	 */

	public static void main(String[] args) {

		System.out.println(VerifyPalindrome("Radar"));
		System.out.println(VerifyPalindrome("Level"));
		System.out.println(VerifyPalindrome("Arun"));

	}

	public static String VerifyPalindrome(String str) {
		String reveresedString = "";
		int strLength = str.length();
		for (int i = (strLength - 1); i >= 0; i--) {
			reveresedString = reveresedString + str.charAt(i);
		}
		if (str.toLowerCase().equalsIgnoreCase(reveresedString)) {
			return "The Given String: " + reveresedString + " is a Palindrome";

		} else {
			return "The Given String: " + reveresedString + " is not a Palindrome";
		}

	}

}
