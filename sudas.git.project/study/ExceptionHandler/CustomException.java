package ExceptionHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class CustomException {

	public static void main(String[] args) throws IOException {

		CustomException customex = new CustomException();
		customex.tryCatch();

	}

	/***********************
	 * java.lang.Object java.lang.Throwable java.lang.Exception
	 * java.lang.RuntimeException java.lang.IllegalArgumentException
	 * java.lang.xyzException If we do not specify how to catch the exception,
	 * the exception will be handled by default handler
	 * 
	 * try and catch are use when I want to try something and there is a
	 * probability that exception would be raised. Java run time exception. The code under question is
	 * placed in the try block and catch clause is used t catch the specific
	 * exception
	 * 
	 * For example public void tryCatch() {
	 * 
	 * int a = 10; int b = 4; try { double divident = a / b;
	 * System.out.println(divident); } catch (ArithmeticException e) {
	 * this is the Exception type object(Object of
	 * throwable) System.out.println("Divided by zero occured"); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * throws is used to throw specific exception for a method throw is followed
	 * by throws to throw the specific exception
	 * @throws IOException 
	 ********************************/

	public void customException() throws IOException {

		File f = new File("C:");
		f.createNewFile();

		throw new FileNotFoundException();

	}

	/*******************************************************/

	public void tryCatch() {

		int a = 10;
		int b = 4;
		try {
			double divident = a / b;
			System.out.println(divident);
		} catch (ArithmeticException e) {
			System.out.println("Divided by zero occured");
		}

	}

}