package sudas.study.example.zero;

public class This {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Anil");
		person.getName();
		System.out.println(person);
				

	}

}


class Person {
	String firstName;
	String lastName;
	String address;
	int age;
	
	
// set method
	
	public void setName(String firstName)
	{
		this.firstName= firstName;
		System.out.println(this);
	}
	
	public String getName()
	{		
		System.out.println(this);
		return firstName;

	}
	
}