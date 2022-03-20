package Java_Basics;

public class SwapTwoNumber {

	public static void main(String[] args) {

 
		 int a = 10;  
		 int b= 20;
		 
		 
		 // a = 20  b = 10
		 
		 // Method 1: Swapping two numbers using a Third Variable.
		 int c;
	
		 
		System.out.println("---------Before Swapping---------------------");
			
		System.out.println("The Value of a is:"+a);
		System.out.println("The Value of b is:"+b);
		 
		c = a;
		a = b;
		b = c;
		System.out.println("---------After Swapping---------------------");
		
		System.out.println("The Value of a is:"+a);
		System.out.println("The Value of b is:"+b);
		
		
		//Method 2: Swapping two numbers without Third Variable.
		int x = 15;
		int y = 25;
		
		// x= 25; y=15;
		System.out.println("---------Before Swapping---------------------");
		
		System.out.println("The Value of x is:"+x);
		System.out.println("The Value of y is:"+y);
		 
		
		x = x+y; // 40
		y= x-y; // (40-25) = 15 
		x = x-y; // (40-15) = 25
		System.out.println("---------Before Swapping---------------------");
		
		System.out.println("The Value of x is:"+x);
		System.out.println("The Value of y is:"+y);
		 

	}

}
