package ExceptionHandler;

// this is the class which uses the custom exception 
public class CustomExceptions {

	public static void main(String[] args) {
		TestCustomException exception = new TestCustomException();
		TestDefaultExceptions defaultException = new TestDefaultExceptions();
		String name = null;
		try {
			exception.displayName(name);
			defaultException.testException(55);
		} catch (CExcep | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

// this is the custom exception class
class CusException extends Exception {

	// basically I am calling the superclass Exception constructor which takes
	// one parameter "message"
	public CusException(String message) {
		super(message);
	}

}

// class to test the custom exception
// an exception should be thrown if the name is null
class TestCustomException {
	String name;

	public void displayName(String name) throws CExcep {
		this.name = name;
		if (this.name == null) {
			throw new CExcep("This is a custom exception for name = null");
		}

		else {
			System.out.println(this.name);
		}
	}

}

// class to test any java default exception
// for example to test IllegalArgumentException

class TestDefaultExceptions {
	public void testException(int age) throws NumberFormatException {
		if (age >= 33) {
			throw new NumberFormatException("Please enter age upto 33");
		}

		else {
			System.out.println("Age is " + age);
		}
	}

}
