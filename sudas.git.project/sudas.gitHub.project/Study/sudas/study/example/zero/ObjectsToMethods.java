package sudas.study.example.zero;

public class ObjectsToMethods {
	int x = 10;
	int y = 20;

	public static void main(String[] args) {

		sudas test = new sudas();

		ObjectsToMethods obj = new ObjectsToMethods(); // this object has a
														// memory location at
														// heap.
		ObjectsToMethods obj1; // this object does not have memory allocation at
								// heap.

		int X = obj.x;
		int Y = obj.y;

		obj1 = obj;

		tClass tclass = new tClass();
		System.out.println(tclass.swap());

		// reference
		One classone;
		classone = new One();

		classone.setname("sdas");
		String name = classone.getname();
		System.out.println("My name is " + name);

	}

}

// java pass by value

class tClass {
	int num1 = 10;
	int num2 = 20;

	// swap method
	public int swap() {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		return num1;

	}

}

class One {
	String name;

	// set name method
	public void setname(String name) {
		this.name = name;
	}

	// get name method
	public String getname() {
		return name;
	}
}

class Two {

}
