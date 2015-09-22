package sudas.study.example.zero;

public class Reference {
	public static void main(String[] args) {
		sClass testclass = new sClass();

		// System.out.println(sClass.x +"\t"+ sClass.y );
		sClass testclass1 = new sClass();

		testclass.swap();
		testclass1.nonswap();


	}

}

class sClass {
	int x = 10;
	int y = 20;

	public void nonswap() {
		System.out.println("Value of non swap x " + x + "\t"
				+ "Value of non swap y " + y);
	}

	public void swap() {
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("Value of swap x " + x + "\t" + "Value of swap y "
				+ y);
	}

}
