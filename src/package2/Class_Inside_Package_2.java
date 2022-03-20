package package2;

//Inheritance -> Inheriting the variables and methods from super class to child class...

import package1.Class_1_Inside_Package_1;

public class Class_Inside_Package_2 extends Class_1_Inside_Package_1{

	public static void main(String[] args) {
		Class_Inside_Package_2 cl1 = new Class_Inside_Package_2();
		cl1.printSum();
		
	}
}
