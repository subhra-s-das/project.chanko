package sudas.study.example.zero;

import java.util.HashMap;
import java.util.Map;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone phone = new SmartPhone("S4");
		phone.findPhone();
		phone.phoneProperties();
	}

}

class SmartPhone {
	String phoneName;
	double weight;
	String model;
	String year;

	// constructor

	SmartPhone(String phoneName) {
		this.phoneName = phoneName;
	}

	public void findPhone() {

		switch (phoneName) {
		case "S4":
			System.out.println("This is from Samsung");
			break;
		case "4s":
			System.out.println("This is from Apple");
			break;
		case "5s":
			System.out.println("This is from Apple");
			break;
		case "6s":
			System.out.println("This is from Apple");
			break;

		default:
			System.out.println("Does not exist");
			break;
			
		}
		

	}
	
	public void phoneProperties()
	{
		
		
		
	}

}