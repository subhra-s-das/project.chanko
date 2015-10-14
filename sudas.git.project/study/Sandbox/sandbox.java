package Sandbox;

public class sandbox {

	public static void main(String[] args) {

		TestInterface intef = new TestClass();
		intef.address();

	}

}

interface TestInterface {
	public void name();

	public void address();

	public void dob();
}

class TestClass implements TestInterface {

	@Override
	public void name() {
		// TODO Auto-generated method stub

	}

	@Override
	public void address() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dob() {
		// TODO Auto-generated method stub

	}

}
