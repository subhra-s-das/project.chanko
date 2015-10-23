package com.sudas.junit;

import com.sudas.junit.Calculator.NewException;

public class ExceptionClass {
	public static void main(String[] args) {

		Calculator cal = new Calculator();

		try {
			int addition=cal.addition("10.1", "10.0");
			System.out.println("RESULT : "+addition);
		} catch (NumberFormatException n) {
			n.getMessage();
			n.printStackTrace();
		}
	}

}

class Calculator {
	String num1;
	String num2;
	int number;

	public int addition(String num1, String num2) throws NumberFormatException {
		this.num1 = num1;
		this.num2 = num2;
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		Calculator c;

		int addition = (number1 + number2);
		if (num1.matches("([0-9]*)\\.([0-9]*)") || num2.matches("([0-9]*)\\.([0-9]*)")) {
			throw new NumberFormatException("incorrect format");
		}
		return addition;
	}

	class NewException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public NewException(String message) {
			// TODO Auto-generated constructor stub
			super(message);
		}
	}
}