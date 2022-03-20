import java.util.Scanner;

public class StarPattern_1 {
	
	/*
	 * 1
	 * 1 2
	 * 1 2 3
	 * 1 2 3 4
	 * 1 2 3 4 5
	 */

	public static void main(String[] args) {
	       
        // Print 5 number of stars
        for (int i=1; i<=5; i++) //Rows 
        {
            for (int j=1; j<=i; j++) //Column
            {
                //System.out.print("*");
                System.out.print(j +" ");
            }
            System.out.println();
        }
        
	}

}
