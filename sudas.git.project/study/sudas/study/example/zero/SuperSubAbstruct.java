package sudas.study.example.zero;

public class SuperSubAbstruct {

	public static void main(String[] args) {
		
		Persons per = new Persons("name", "address");
		System.out.println(per.name);
		System.out.println(per.address);
		

	}

}

// constructor cannot be inherited
// constructor can be called from super to subclass

class Persons {
	// instance variable of super class
	String name;
	String address;
	int age;
	
	//constructor
	public Persons(String name, String address)
	{
//		System.out.println("default constructor");
		this.name=name;
		this.address=address;
	}

}

class Teacher extends Persons {

	
	
	// constructor cannot be inherited has to explicitly  define it
	public Teacher(String name, String address) {
		super(name, address);
		// This is where I am defining the constructor for the subclass. And using super calling the 
	}

	String subject;
	


}

class Student extends Persons {

	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	String studentID;
	


}
