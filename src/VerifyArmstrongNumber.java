import java.util.Scanner;

public class VerifyArmstrongNumber {

	/*
	 * Armstrong Number Example
	 * ==============================
	 * 153: 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125+ 27 = 153 is an Armstrong Number
	 * 1634: 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1643 is an Armstrong Number
	 * 125: 1*1*1 + 2*2*2 + 5*5*5 = 1 + 8 + 125 = 134 is not an Armstrong Number
	 */
	
	//function to check if the number is Armstrong or not  
	//static boolean isArmstrong(int n) {
		
		
		
	//}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");  
		//reads the limit from the user  
		int num=sc.nextInt(); 

		if(isArmStrongNumber(num)) {
			System.out.print("The Given Number "+ num+" is Armstrong Number");  
		}
		else {
			System.out.print("The Given Number "+ num +" is not an Armstrong Number");  
		}
	}

	public static boolean isArmStrongNumber(int n) {
		
		  int temp, digits=0,last=0,sum=0;
		  
		//assigning n into a temp variable  
		  temp = n;
		//loop execute until the condition becomes false  
		  while(temp > 0) {
			  
			  temp = temp/10;
			  digits++;
			  //System.out.println("The Temp value after dividing by 10 is: "+temp);
		  }
		  temp = n; 
		 
		  while(temp > 0)   
		  {   
		  //determines the last digit from the number      
		  last = temp % 10;   
		  //calculates the power of a number up to digit times and add the resultant to the sum variable  
		 //System.out.println((Math.pow(last, digits)));
		  sum += (Math.pow(last, digits));
		  
		  //removes the last digit   
		  temp = temp/10;   
		  }
		  
		//compares the sum with n  
		  if(n==sum) {
		  //returns if sum and n are equal  
		  return true;      
		 
		  }
		else {
		  //returns false if sum and n are not equal  
		  return false;  
		 }   
	}
}
