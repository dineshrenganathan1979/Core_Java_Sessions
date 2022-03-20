import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Student {
	
	// Attributes of student
    String name;
    int age;

    // Parameterized constructor
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	// Getter setter methods
    public String getName() { 
    	return name; 
    	}
 
    public void setName(String Name) { 
    	this.name = name; 
    	}
 
    public Integer getAge() { 
    	return age;
    	}
 
    public void setAge(Integer Age) { 
    	this.age = age;
    	}
    
 // Method
    // Overriding toString() method
    @Override 
    public String toString()
    {
        return "Customer{"
            + "name=" + name + ", age=" + age + '}';
    }
    static class CustomerSortingComparator  implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {
			int nameCompare = s1.getName().compareTo(s2.getName());
			int ageCompare = s1.getAge().compareTo(s2.getAge());
			
			return (nameCompare==0) ? ageCompare : nameCompare; //Ternary Operator
		}
    
    }



public static void main(String args[])
	
	{
		// Create an empty ArrayList to store Student
		
		List<Student> al = new ArrayList<>();
		Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);
        
        // Adding customer objects to ArrayList
        // using add() method
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);
        
     // Iterating using Iterator
        // before Sorting ArrayList
        Iterator<Student> custIterator = al.iterator();
        

        // Display message
        System.out.println("Before Sorting:\n");
 
     // Holds true till there is single element
        // remaining in List
        while (custIterator.hasNext()) {
 
            // Iterating using next() method
            System.out.println(custIterator.next());
        }
 
     // Sorting using sort method of Collections class
        Collections.sort(al, new CustomerSortingComparator());
     // Display message only
        System.out.println("\n\nAfter Sorting:\n");
 
        // Iterating using enhanced for-loop
        // after Sorting ArrayList
        for (Student customer : al) {
            System.out.println(customer);
        }
		
	}
	
	
	
	

}
