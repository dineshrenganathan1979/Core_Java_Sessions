package Java_Basics;

public class MethodOverLoadingDemo1 { // Polymorphism Concept..
	
    int c;
	int a= 5;
	int b = 6;
		
	void sum() { //Normal Method
		
		System.out.println(a+b); //11
	}
	
	void sum(int a, int b) { //Overloaded Method -> Polymorphism -> Concept
		
		System.out.println(a+b); //30
	}
	
	

	public static void main(String[] args) {
		
		MethodOverLoadingDemo1 md = new MethodOverLoadingDemo1();
		md.sum();
		md.sum(10,20);
		

	}

}
