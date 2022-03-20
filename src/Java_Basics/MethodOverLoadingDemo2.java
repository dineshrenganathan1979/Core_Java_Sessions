package Java_Basics;

public class MethodOverLoadingDemo2 {
	float x;
	float y;
	
	void sum(float a, float b) { //Overloaded Method -> Polymorphism -> Concept
		
		System.out.println(a+b); //69.81
	}
	
	void sum(String a, String b) {
		System.out.println(a+b); //WelcomeKumar
	}
	
	
	public static void main(String[] args) {
		MethodOverLoadingDemo2 md2 = new MethodOverLoadingDemo2();
		
		md2.sum(25.56f, 66.56f);
		md2.sum("Hello","World");


	}

}
