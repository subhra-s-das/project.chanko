package sudas.study.example.one;

public class CallingSuperClassConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Grandpa {
	String firstName;
	String address;
	String lastName;

	// public Grandpa()
	// {
	//
	// }

	public Grandpa(String firstName) {

	}

	public Grandpa(String firstName, String lastName) {

	}

	public Grandpa(String firstName, String address, String lastName) {

	}

	public String getFirstName() {
		return firstName;
	}

	public String getAddress() {
		return address;
	}

	public String getLastName() {
		return lastName;
	}

}

class Father extends Grandpa {

	public Father(String firstName) {
		super(firstName);
	}

	/***
	 * The superclass needs a default constructor else when the subclass extends
	 * the superclass the subclass will throw and error
	 * "Implicit super constructor Grandpa() is undefined for default constructor. Must define an explicit constructor"
	 * This is because the constructors are not inherited.
	 * 
	 ***/

}

class Son extends Father {

	public Son(String firstName) {
		super(firstName);
		// TODO Auto-generated constructor stub
	}

}

abstract class Smartphone {
	String model;
	String IMEA;

	// default constructor

//	public Smartphone() {
//
//	}

	// a parameterized constructor
	public Smartphone(String model, String IMEA) {
		this.model = model;
		this.IMEA = IMEA;
	}
	
	public abstract String displayInfo();
}

class iPhone extends Smartphone {

	public iPhone(String model, String IMEA) {
		super(model, IMEA);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
