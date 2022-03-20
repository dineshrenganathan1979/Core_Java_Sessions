package Java_Basics;

public class Switch_Case_Demo {

	
public static void main(String[] args) {
		
	Switch_Case_Demo sc = new Switch_Case_Demo();
	sc.printDayInNumberFormat("SUNDAY");
	    //int var = sc.returnDayInNumberFormat("MODAY");
	  // System.out.println(var);
	}

public void printDayInNumberFormat(String day ) {
	
	switch(day) {
	case "SUNDAY":
		System.out.println("1");
		break;
		
	case "MONDAY":
		System.out.println("2");
		break;
		  
	case "TUESDAY":
		System.out.println("3");
		break;
		  
	case "WENESDAY":
		System.out.println("4");
		break;
		
	case "THURSDAY":
		System.out.println("5");
		break;
		
	case "FRIDAY":
		System.out.println("6");
		break;
		 
	case "SATURDAY":
		System.out.println("7");
		break;
		 
	default:
	  System.out.println("You have given invalid date pls try again..");
}

}
	
	
public int returnDayInNumberFormat(String day ) {
		
		switch(day) {
		case "SUNDAY":
			  return 1;
		case "MONDAY":
			  return 2;
		case "TUESDAY":
			  return 3;
		case "WENESDAY":
			  return 4;
		case "THURSDAY":
			  return 5;
		case "FRIDAY":
			  return 6;
		case "SATURDAY":
			  return 7;
		default:
		  System.out.println("You have given invalid date pls try again..");
	}
		return 0;
  }

}
