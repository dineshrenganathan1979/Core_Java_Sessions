package OOPS_Concepts.Polymorphism;

class Bike{
	   void run(){
		   System.out.println("running");
	   }
	 }


class Splender extends Bike{
     @Override
	 void run(){
		   System.out.println("running safely with 60km");
	   }
	 }
	 

public class Polymorphism_Demo1 {
	

	public static void main(String[] args) {
		
		 Bike b = new Splender(); //upcasting
	     b.run();
		
	     //Downcasting is not allowed in Java..
	     //Splender s = (Splender) new Bike();//downcasting
	    // b.run();

	}

}
