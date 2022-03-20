package Java_Basics;

public class MethodOverridingDemo extends MethodOverLoadingDemo1  { // Polymorphism Concept..
	
	//Java supports only Multi-level inheritance through classes.
	//Java does not support Multiple Inheritance directly (but it can be achieved through Interfaces In-Directly)
	

	
	int x= 90;
	int y = 80;
	
//	void sum() { // Overridden Method in Child Class
//		int a = 50;
//		int b = 20;
//		System.out.println(a+b);
//	}
	
	void subtraction() {
		
		System.out.println(x-y);
		
	}
	
	public static void main(String[] args) {

		
		MethodOverLoadingDemo1 md = new MethodOverLoadingDemo1();
		md.sum(); //11
		
		
		MethodOverridingDemo md2 = new MethodOverridingDemo();
		md2.subtraction();
		md2.sum();

	}

}
