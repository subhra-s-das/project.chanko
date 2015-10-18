package com.sudas.junit;

import java.lang.reflect.Field;

public class Exception {
	Double num1;
	Double num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Exception().addition(10.0, 10.0);

	}

	public double addition(Double num1, Double num2) throws CustomException {
		this.num1 = num1;
		this.num2 = num2;
		double total = num1 + num2;

	
		if (num1 == 0.0 || num2 == 0.1) {
			throw new CustomException("WRONG ARGUMENT");
		}
		return total;

	}
}

class CustomException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}