import java.util.Scanner;

public class PrintAllArmstrongNumbers_in_a_Range {

	public static void main(String[] args) {
		int num;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the limit: ");  
		//reads the limit from the user  
		num=sc.nextInt();  
		System.out.println("Armstrong Numbers up to "+ num + " are: ");  
		for(int i=0; i<=num; i++) {
			if(isArmStrongNumber(i)) {
				System.out.print(i+ ",");
			}
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
