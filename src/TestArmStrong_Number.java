import java.util.Scanner;

public class TestArmStrong_Number {

	public static void main(String[] args) {

	   System.out.println("Enter any number");
       Scanner scr = new Scanner(System.in);
       int num =scr.nextInt();
       
       int temp, sum=0, digit = 0, last=0;
       temp = num;
       while(temp > 0 ) {
    	  
    	  temp = temp/10;
    	   digit++;
       }
		System.out.println("total digits: "+digit);
		temp = num;
		while(temp > 0) {
		//determines the last digit from the number
		last = temp % 10;
        sum += (Math.pow(last, digit));
		//removes the last digit   
		temp = temp/10;   
	}
	if(num == temp) {
		System.out.println("The Given Number: "+ num +" is an Armstrong number");
	}
	else {
		System.out.println("The Given Number: "+ num +" is not an Armstrong number");
	}
}

}
