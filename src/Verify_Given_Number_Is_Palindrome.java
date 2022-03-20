
public class Verify_Given_Number_Is_Palindrome {

	/*
	 * Logic ===== A number that is equal to the reverse of that same number is
	 * called a palindrome number. For example, 3553, 12321, etc. while loop to
	 * reverse num and store the reversed number in reversedNum if...else to check
	 * if reversedNum is same as the originalNum
	 * 
	 */
	public static void main(String args[]) {
		System.out.println(verifyPanlindromeNumber(3553));
		System.out.println(verifyPanlindromeNumber(12321));
		System.out.println(verifyPanlindromeNumber(15768));
	}

	public static String verifyPanlindromeNumber(int num) {

		String reversedNumberString = "";
		String numberString = String.valueOf(num);
		for (int i = numberString.length() - 1; i >= 0; i--) {
			reversedNumberString = reversedNumberString + numberString.charAt(i);

		}
		if (Integer.parseInt(numberString) == Integer.parseInt(reversedNumberString)) {
			return "The Given Number : " + num + " Is a Palindrome Number";
		} else {
			return "The Given Number : " + num + " Is not a Palindrome Number";
		}
	}
}