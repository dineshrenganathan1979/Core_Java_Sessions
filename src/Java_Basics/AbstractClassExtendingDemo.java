package Java_Basics;

public class AbstractClassExtendingDemo extends AbstractClassDemo {

	public static void main(String[] args) {
		AbstractClassExtendingDemo acd = new AbstractClassExtendingDemo();
		acd.sub(); //120 
		acd.c=5;
		acd.subtraction(); //5

	}

	@Override
	void sub() {
	
		System.out.println(55+65);
		
	}

}
