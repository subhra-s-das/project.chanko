package com.sudas.junit;

public class Exception {

	public static void main(String[] args) {

	}

}

// create a custom exception for illegal argument exception
// and check illegal arguments

class TestIllegalArgument {
	Double num1;
	Double num2;

	// this is the method which throws exception
	public void addition(Double num1, Double num2) throws CustomException {
		this.num1 = num1;
		this.num2 = num2;

		// use java reflection to check the field types

	}
}

class CustomException extends IllegalArgumentException {
	public CustomException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}