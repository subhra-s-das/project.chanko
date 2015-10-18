package Reflections;

import java.lang.reflect.Field;

public class ReflectionsAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseReflections reflection = new UseReflections();
		reflection.refections();

		new useMoreReflections("sudas", +10).refections();

	}

}

class UseReflections {
	// Fields
	String name;
	int age;
	double salary;
	char lastname;

	public void refections() {
		// find the number of fields
		UseReflections u;
		u = new UseReflections();
		Field[] fields = u.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field fieldName = fields[i];
			System.out.println("Field Name " + fieldName.getName() + '\t' + fieldName.getType().getName());
		}

	}

}

// using this instead of class name
class useMoreReflections {
	String firstName;
	int age;

	public useMoreReflections(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	public void refections() {
		try {
			System.out.println(this.getClass().getField(this.firstName).getType().getName());
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}




