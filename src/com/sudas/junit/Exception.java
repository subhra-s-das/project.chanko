package com.sudas.junit;

import java.lang.reflect.Field;

public class Exception {

	public static void main(String[] args) {

		TestIllegalArgument T = new TestIllegalArgument();
		try
		{
		T.addition(Double.parseDouble("10"),10.0);
		}
		catch (CustomException c)
		{
			c.printStackTrace();
		}
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
		TestIllegalArgument a = new TestIllegalArgument();
		Field[] fields = a.getClass().getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			String typeName = fields[i].getType().getName();
//			System.out.println(typeName);
			if(typeName=="java.lang.Double")
			{
			System.out.println("True");
			}
			else
			{
				throw new CustomException("not double");
			}
		}

	}
}

class CustomException extends IllegalArgumentException {
	public CustomException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}