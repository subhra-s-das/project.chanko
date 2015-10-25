package Sandbox;

public class Inheritance {

	public Inheritance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent {
	String firstName;
	String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

class child extends Parent
{
	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}
	
	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}
}