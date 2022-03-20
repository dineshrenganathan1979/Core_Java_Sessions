
public class StarPattern_4 {
	
	public static void main(String args[]) {
		
		for(int i=1; i<=7 ; i++) { //Rows
			
			for(int j=1; j<=i; j++) { //Cols
				System.out.print(" ");
			}
			
			for(int k=1; k<=7-i; k++) { //Cols
				System.out.print(k+" ");
				//System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
