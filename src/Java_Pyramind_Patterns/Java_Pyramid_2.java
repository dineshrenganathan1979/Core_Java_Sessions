package Java_Pyramind_Patterns;

public class Java_Pyramid_2 {
	public static void main(String[] args) {
		/*
		 *        1
		 *      1 2
		 *    1 2 3  
		 *  1 2 3 4
		 *1 2 3 4 5  
		 */
		
		for(int i=1; i<=5; i++) { //outer for loop for rows
			
			for(int k=1; k<=5-i ; k++) { //inner for loop for columns
				System.out.print(" ");
			}
			
			for(int j=1; j<=i ; j++ ) { //inner for loop for columns
				
				System.out.print(j);  				
			}
			System.out.println();
		}
	}
}
