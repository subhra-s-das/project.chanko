package sudas.study.example.one;

public class ObjectCounter {

	public static void main(String[] args) {
		
	ObjCounter o1 = new ObjCounter();
	o1.counter();
		
	ObjCounter o2 = new ObjCounter();
	o2.counter();
		
	ObjCounter o3 = new ObjCounter();
	o3.counter();
	}

}

class ObjCounter{
	static int counter=0;
	
	public void counter()
	{
		System.out.println("Number of object created " +counter++);
	}
	
}
