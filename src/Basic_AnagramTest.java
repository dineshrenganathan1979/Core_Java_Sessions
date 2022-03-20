import java.util.Arrays;

public class Basic_AnagramTest {

	public static void main(String[] args) {

     String str1 ="abc";
     String str2 ="cba";
     
     
     char[] charArray1 = str1.toCharArray(); // a b c
     char[] charArray2 = str2.toCharArray(); // c a b
     
     if(isAnagram(charArray1,charArray2)) {
    	 System.out.println("The Two Strings: "+str1 +" and " + str2 +" are Anagrams");
     }
     else {
    	 System.out.println("The Two Strings: "+str1 +" and "+ str2 +" are not Anagrams");
     }
  
	}
	
	public static boolean isAnagram(char[] str1, char[] str2) {
		
		if(str1.length != str2.length) {
	    	 return false;
	     }
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0; i<str1.length; i++) {
			if(str1[i] == str2[i]) {
				return true;
			}
		}
		
		return false;
		
	}
}
