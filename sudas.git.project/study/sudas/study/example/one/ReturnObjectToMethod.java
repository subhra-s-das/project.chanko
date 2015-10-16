package sudas.study.example.one;



public class ReturnObjectToMethod {

	public static void main(String[] args) {

		System.out.println(new ReturnObjectToMethod().returnObject(10, 20));
		
		ReturnObjectToMethod returnobj = new ReturnObjectToMethod();
		String[] stringArray = returnobj.arrayObject();
		

	}

	public Integer returnObject(int a, int b) {
		// addition of numbers

		int sum = a + b;
		return sum;

	}

	public String[] arrayObject() {
		String name[] = { "John", "Peter", "Ramu" };

		return name;
	}
}
