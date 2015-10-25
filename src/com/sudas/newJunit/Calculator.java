package com.sudas.newJunit;

public class Calculator {
	public static void main(String[] args) {
		Calculators calculator = new Calculators("10.1", "10.1");
		System.out.println(calculator.twoDigitAddition());
	}
}

class Calculators {
	String num1;
	String num2;
	String num3;
	String num4;

	public Calculators(String num1, String num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Calculators(String num1, String num2, String num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public Calculators(String num1, String num2, String num3, String num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	public int addition() {
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);

		int twoTotal = (number1 + number2);
		return twoTotal;
	}

	public double twoDigitAddition() {
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		double total = (number1 + number2);
		return total;
	}

	public double threeDigitAddition() {
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		double number3 = Double.parseDouble(num3);
		double total = (number1 + number2 + number3);
		return total;
	}

	public double FourDigitAddition() {
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		double number3 = Double.parseDouble(num3);
		double number4 = Double.parseDouble(num4);
		double total = (number1 + number2 + number3 + number4);
		return total;
	}

}
