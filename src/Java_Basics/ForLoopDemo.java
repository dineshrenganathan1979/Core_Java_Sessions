package Java_Basics;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		for(int i=1; i<=10 ; i++) {
			
			
			//Difference between break and continue keywords in java.
			if(i==5) {
				//continue; 
				break;
			}
			System.out.println("The Value of i is: "+i);
		}
	

	}

}
