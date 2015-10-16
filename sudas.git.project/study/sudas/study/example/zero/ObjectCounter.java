package sudas.study.example.zero;

public class ObjectCounter {

	public static void main(String[] args) {
	
		objCounter object1 = new objCounter();
		object1.counter();
		objCounter object2 = new objCounter();
		object2.counter();
		objCounter object3 = new objCounter();
		object3.counter();
		objCounter object4 = new objCounter();
		object4.counter();
		objCounter object5 = new objCounter();
		object5.counter();
		

	}

}


class objCounter
{
	static int counter=10;
	/*
	 * when the variable  is not static we need to instantiate   
	 */
	
	public void counter()
	{
		
		int count = counter++;
		
		System.out.println(count);
		
	}
	
}