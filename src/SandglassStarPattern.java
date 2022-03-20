public class SandglassStarPattern {

	public static void main(String[] args) {
		int i, j, k;
		int n = 6;
		for (i = 0; i <= n - 1; i++) {  //Rows
			for (j = 0; j < i; j++) { //Columns for Row 1
				System.out.print(" ");
			}
			for (k = i; k <= n - 1; k++) { //Columns for Row 2
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for (i = n - 1; i >= 0; i--) {  //Rows
			for (j = 0; j < i; j++) { //Columns for Row 2
				System.out.print(" ");
			}
			for (k = i; k <= n - 1; k++) { //Columns for Row 2
				System.out.print("*" + " ");
			}
			System.out.println("");
		}

	}
}