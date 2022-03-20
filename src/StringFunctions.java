import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
//
//     String str ="Welcome";  //emcoleW
//     
//     String str1 = new String("Welcome");
//     String str2 = new String("India");
//     
//     System.out.println(str1.concat(str2));// WelcomeIndia
//     
//     str1.replace("Welcome", "hi");
//     System.out.println(str1); //Welcome  => Because String Class is Immutable
//     
//     StringBuffer strB1 = new StringBuffer("Welcome");
//     StringBuffer strB2 = new StringBuffer("India");
//     System.out.println(strB1.append(strB2)); //
//     
//     //strB1.reverse();  // String Buffer is mutable
//     System.out.println(strB1); //emocleW
//     System.out.println(strB2); //Welcome

     
     
//     System.out.println(str1.equals(str2));//true
     
//     System.out.println(str.equals(str1)); // true
//     
//     System.out.println(str == str1); // false
//     
//     System.out.println(str1 == str2); // true
     
    
   //  System.out.println(strB1.equals(strB2)); //false
     
  //   System.out.println(strB1.reverse()); //emocleW // String Buffer is Mutable hence the value is changed
  //   System.out.println(strB1);
  //   System.out.println(strB1.append("To India"));

		
		String str= "welcome to india"; // o/p -> eeclmow ot adiin
//	    System.out.println(str.substring(8, 10));
//		System.out.println(str.substring(8));
//		System.out.println(str.charAt(3)); //-> will retrun the character
//		System.out.println(str.indexOf("c"));// -> will retrun the index
		
		 String[] strArray  = str.split(" ");
		 char[] c1 = strArray[0].toCharArray();
		 char[] c2 = strArray[1].toCharArray();
		 char[] c3 = strArray[2].toCharArray();
		 Arrays.sort(c1);
		 Arrays.sort(c2);
		 Arrays.sort(c3);
		 
		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
		 String str1 = new String(c1);
		 String str2 = new String(c2);
		 String str3 = new String(c3);
		 
		System.out.println(str1+" "+str2+" "+str3);
		
     
     
	}

}
