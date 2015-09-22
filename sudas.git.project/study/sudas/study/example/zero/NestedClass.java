package sudas.study.example.zero;

import sudas.study.example.zero.Outer.Inner;

public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer(); // create an object of outer calss
		Outer.Inner inner = outer.new Inner();

	}

}

// static and non static nested class
class Outer {
	// instance variable of outer class
	int outer_x;
	int outer_y;

	// outer class method
	public void displaySum() {
		int outer_total=outer_x + outer_y;
	}

	// create a method to access the variables and methods of inner class
	public void accessInner() {
		Inner inner = new Inner();
		inner.nameSize();
	}
	
	public void accessInner1() {
		System.out.println();
	}

	class Inner {
		String name = "sdas";

		public void nameSize() {
			System.out.println(name.length());
		}
		
		public void accessOuter()
		{
			System.out.println(outer_x);
			System.out.println(outer_x+outer_y);
		}
	
	}

}

class Test1 extends Test2 {

	public void object() {

	}
}

class Test2 {

	public void object2() {

	}

}
