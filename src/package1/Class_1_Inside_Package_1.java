package package1;

public class Class_1_Inside_Package_1 {

	private int sum=0;
	private int a= 10;
	private int b= 20;
	private int age = 45; // Default -> Within the Same Package...
	 
	 protected void printSum() {
		 sum = a+b;
		 System.out.println("The Sum of two number is: "+sum);
	 }
	  
	public static void main(String[] args) {

		Class_1_Inside_Package_1 ci = new Class_1_Inside_Package_1();
		
		  System.out.println(ci.a);
		  System.out.println(ci.b);
		  System.out.println(ci.age);
		  ci.printSum();
	}

}
