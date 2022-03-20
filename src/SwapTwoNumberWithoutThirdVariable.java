
public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {


		int x =10;
		int y =20;
		
		System.out.println("******* Before Swapping************");
		System.out.println("x value is: "+x);
		System.out.println("y value is: "+y);
		 x = x+y; // 10+20 = 30
		 y = x-y; // 30-20 = 10
		 x = x-y; //30-10 = 20
		 
		System.out.println("******* After Swapping************");
		System.out.println("x value is: "+x);
		System.out.println("y value is: "+y);
		
		
	}

}
