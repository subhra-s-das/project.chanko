package sudas.study.example.zero;

public class Static {

	public static void main(String[] args) {

		TestStatic test1 = new TestStatic();
		TestStatic test2 = new TestStatic();
		TestStatic test3 = new TestStatic();
		TestStatic test4 = new TestStatic();

		test1.printinfo();
		test2.printinfo();
		test3.printinfo();
		test4.printinfo();
		// create an object of class and access instance variables and methods
		String test = test1.name;

		// creating different copies of instance variable for different objects

		VariableTest var = new VariableTest();
		var.variable = "subhra_das@bmc.com";
		var.TestMethod();

		VariableTest var1 = new VariableTest();
		var1.variable = "pranatidas2004@gmail.com";
		var1.TestMethod();
		
		VariableTest var0 = new VariableTest();
		String value = var0.variable;
		System.out.println(value);

	}
}

class TestStatic {
	String name = "ABCD";
	static int number = 10;

	public void printinfo() {

		int testnum = number++;

		System.out.println(" " + testnum);

	}

}

class VariableTest {
	String variable = "subhra.s.das@gmail.com";

	public void TestMethod() {

		System.out.println(this.variable);
	}

}