package Java_Basics;

public class Constructor_Demo {
	
	
	int a= 5;
	int b = 6;
	
	float x;
	float y;
	
	
	Constructor_Demo(){ //Default Constructor
		super();
	}
	
	Constructor_Demo(int a, int b){  //Overloaded Constructor
		this.a =a;
		this.b= b;
	}
	
	Constructor_Demo(float x, float y){  //Overloaded Constructor
		this.x =x;
		this.y= y;
	}
	
	
	
	
	
  public static void main(String args[]) {
	  Constructor_Demo cd = new Constructor_Demo();  
	  Constructor_Demo cd2 = new Constructor_Demo(25,55);
	
      System.out.println(cd.a+cd.b); //11
      System.out.println(cd2.a+cd2.b); //80
	  
  }
	
}
