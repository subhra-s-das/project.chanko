package ExceptionHandler;

import java.io.File;
import java.io.IOException;

public class ExceptionTutorial {

	public static void main(String[] args) {

		try {
			new ExceptionTutorial().TestFileException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new ExceptionTutorial().TestFileException1();
		new TestCustomExceptions().checkMobilePhoneName("ddd");
	}

	/*** Example about Java in built exception class ***/

	/*
	 * Method "TestFileException" is throwing IOException and try catch block on
	 * main method where "TestFileException" method's object is created is
	 * catching the IO exception
	 */

	public void TestFileException() throws IOException {
		File file = new File("C:/does_not_exist");
		file.createNewFile();
	}

	public void TestFileException1() {
		File file = new File("C:/does_not_exist");
		try {
			// here I am using the createNewFile method, this method throws
			// IOException - If an I/O error occurred.
			// the catch block is catching the IO exception
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

/*** Example about Java custom exception / user defined exception ***/
/*
 * This exercise is to built a custom exception class Use the custom exception
 * class in your method and throw the exception
 * 
 */

class UserException extends RuntimeException {
	public UserException(String message) {
		super(message);
	}
}

// create a method which will throw the custom exception created
class TestCustomExceptions {
	public void checkMobilePhoneName(String name) throws UserException {
		if (name.contentEquals("apple")) {
			System.out.println("This is a iPhone");
		} else {
			throw new UserException("Wrong phone");
		}
	}

}
