package sudas.study.example.one;

abstract class AbstructC1 {

	// abstract method
	abstract void method01();

	// abstract method
	abstract void method02();

	// normal method
	public void normalMethod() {
		System.out.println("this is a normal method");
	}

	// static method
	public static void staticMethod() {
		System.out.println("This is a static method");
	}

	abstract class AbstructC2 {
		// abstract method 1
		abstract void method01();

		// abstract method 2
		abstract void method02();

	}
}

public class InterfaceAbstructClass {

	public static void main(String[] args) {
		
		//create object of outer class| outer class will call the inner class methods
		Outers outer = new Outers();
		outer.outerMethod();

	}

}

class Outers {
	String outer = "OuterVariable";

	public void outerMethod() {
		System.out.println("This is outer method");
		// create an instance of inner class in outer class method
		Inner inner = new Inner();
		inner.innerMethod();

	}

	class Inner {
		String inner = "InnerVariable";

		public void innerMethod() {
			// access outer class variable in inner class method
			System.out.println("This is a inner method" + outer);
		}
	}

}
