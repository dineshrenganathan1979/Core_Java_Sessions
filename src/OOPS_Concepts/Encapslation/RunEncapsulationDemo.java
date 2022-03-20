package OOPS_Concepts.Encapslation;

public class RunEncapsulationDemo {

	public static void main(String[] args) {
		Encapsulation_Demo ed = new Encapsulation_Demo();
		ed.setAge(35);
		ed.setIdNum("SCT_142");
		ed.setName("Pavithra");
		
		System.out.println(ed.getAge());
		System.out.println(ed.getIdNum());
		System.out.println(ed.getName());

	}

}
