package Java_Basics;

public class ImplementingInterfaceDemo implements InterfaceDemo {

	public static void main(String[] args) {
		
		
		ImplementingInterfaceDemo id = new ImplementingInterfaceDemo();
		id.sum();
		id.printSum();

	}

	@Override
	public void sum() {
		
		System.out.println(c+d);
	}

	@Override
	public void printSum() {
		System.out.println(c+d);
		
	}

}
