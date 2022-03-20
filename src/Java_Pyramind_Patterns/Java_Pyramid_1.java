package Java_Pyramind_Patterns;

public class Java_Pyramid_1 {

	/*
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 * 1 2 3 4 
	 * 1 2 3 4 5
	 */

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // outer for loop for rows

			for (int j = 1; j <= i; j++) { // inner for loop for columns

				System.out.print(j +" ");
			}
			System.out.println();
		}

	}

}
