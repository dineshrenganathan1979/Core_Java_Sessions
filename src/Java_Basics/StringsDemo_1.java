package Java_Basics;

// 1. JRE -> You can only run or execute java programs but you cannot develop any java programs. (JAVA)

// 2. JDK -> You can only run or execute java programs but you can also develop any java programs. (JAVAC)

//3. JVM -> Java Virtual Machine.. -> Java is Platform Independent - > You can execute Java Programs on Any System and any OS.

// 4. Eclipse -> Editor for Compiling and Executing Java Programs -> Used by QA Automation Engineers.

// 5. IntelliJ IDE -> Used by Java and J2EE -> Used by Developers..


public class StringsDemo_1 {

	public static void main(String[] args) { 

		String str = "Welcome to java programming"; 
		
		System.out.println("The Length of the String is: "+str.length()); // length = 27 (String index starts from 0)
				
		 String arr[]= str.split(" "); // Converting a String to Array
		 
		 System.out.println("The Length of the Array is: "+arr.length); // length = 4 (Array index starts from 0)
		
		 System.out.println("----------------------------------------------------------");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("The Value of i is: "+i);
			System.out.println("Array Value is: "+arr[i]);
		}
		
		 System.out.println("----------------------------------------------------------");
	}

}
