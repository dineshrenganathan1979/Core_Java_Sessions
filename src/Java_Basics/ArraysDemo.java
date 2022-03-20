package Java_Basics;

public class ArraysDemo {

	public static void main(String[] args) {

	// Types of Arrays => 1. One Dimensional Array  2. Two Dimensional Array.
		
		int arr[] = new int[3]; // Declaration of Integer Array --> Accepts only Integer Data Type.
		arr[0] = 103;
		arr[1] = 105;
		arr[2] = 106;

		
		int arr1[] = {10, 20, 30 , 20};
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	

		String str[] = new String[4]; // Declaration of String Array --> Accepts only String Data Type.
		str[0] ="Ravi";
		str[1] ="Hari";
		str[2] ="Kumar";
		str[3] ="123";
		
		
		String str1[] = {"Welcome","To","Java", "Programming"};
		
		
	    Object ob[] = new Object[3]; // Declaration of Object Array - > This Array will accept all Data Types (Integer, Char, String , Float & Double)
		Object obj[] = {10, "Welcome", 20, 'A', 30.35, 32.45678};
		
		
		//Iterating or Retrieveing values from an Array
		
		//Method 1: Using Classic or Regular For Loop
		
//		System.out.println("The Length of the Array arr is: "+arr.length);
//			
//		for(int i=0; i<arr.length; i++) {
//			
//			System.out.println(arr[i]);
//			
//		}
		
	   //Method 2: Using Enhanced For Loop -> Arrays it is used in Collections (List, Set ,Queue>
       
//		for(Object o: obj) {
//			System.out.println(o);
//		}
		
		
	}
}
