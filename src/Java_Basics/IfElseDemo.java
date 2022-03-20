package Java_Basics;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IfElseDemo {

	public static void main(String[] args) {

 // Grade A >= 75
		
// Grade B >= 50
		
// Failed  > 50 
		
//		int age = 10;
//		
//		if(age > 18) {
//			System.out.println("The Person is eligible to Vote");
//		}
//		else {
//			System.out.println("The Person is not eligible to Vote");
//		}
		
		int mark = 45;
		
		if(mark >= 75)
		{
			System.out.println("The Student is passed with Grade A");
		}
		else if(mark >= 50 && mark <=75 ) {
			System.out.println("The Student is passed with Grade B");
			
		}
		else {
			System.out.println("The Student had Failed.");
		}
	
		
	}

}
