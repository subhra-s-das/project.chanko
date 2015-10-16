package ExceptionHandler;

public class ExceptionExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		double result;
		try {
			result = cal.add(0, 0);
			System.out.println(result);
		}

		catch (CExcep c) {
		 c.printStackTrace();
		 System.out.println("message "+c.getMessage());
		 
		
		}

	}

}

class CExcep extends RuntimeException {


	public CExcep(String message) {
		// TODO Auto-generated constructor stub
		 super(message);
	}

}

class Calculator {
	public double add(double num1, double num2) throws CExcep {
		double addition = num1 + num2;

		if (addition == 0.0) {
			throw new CExcep("Not allowed");
		} else {
			return addition;
		}
	}
}