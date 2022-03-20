import java.util.Scanner;

public class DisplayAll_PrimeNumbers_In_a_Range {

	public static void main(String[] args) {

		System.out.println("Enter a Limit: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The Prime Numbers up to "+ num + " are: ");  
		for(int i=0; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+ ",");
			}
		}


	}

	private static boolean isPrimeNumber(int n) {
        int m = n/2;
        int flag = 0;
        boolean isPrime=false;
        if(n==0||n==1) {
        	
        }
        else {
        	for(int i=2; i<m; i++) {
        		if(n%i == 0) {
        			flag = 1;
        			break;
        		}
        		
        	}
        	if(flag==0) {
        		return true;
        	}
        }
		return isPrime;
	}
	
	
	

}
