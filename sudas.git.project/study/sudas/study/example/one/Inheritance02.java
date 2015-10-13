package sudas.study.example.one;

public class Inheritance02 {

	public static void main(String[] args) {

		// object of super class
		
		MobilePhone MPhone = new MobilePhone();
		MPhone.number=567890;
		MPhone.makecall(99999);
		
		
		
		

		Sphones Sphone = new Sphones();
		Sphone.brand="BB";
		System.out.println(Sphone);
		Sphone.makecall(888888);
		Sphone.priceInfo(100.0);

		
		OrdinaryPhone Ophone = new OrdinaryPhone();
		Ophone.model = "iPhone 6";
		Ophone.brand = "Apple";
		System.out.println("Bramd :"+Ophone.brand);
	}

}

/*
 * Simple inheritance example
 */

class MobilePhone {
	double price;
	double weight;
	String color;
	long number;

	public void makecall(long number) {
		this.number = number;
		System.out.println("calling from Mobile Phone...." + number);
	}

	public void priceInfo(double price) {
		this.price = price;
		System.out.println("Price of phone " + price);
	}

}

class Sphones extends MobilePhone {
	String model;
	String brand;

	@Override
	public void makecall(long number) {
		System.out.println("calling from Smart Phone ...." + number);
		System.out.println(this);
		super.makecall(super.number);
	}
	
	@Override
	public void priceInfo(double price) {
		System.out.println(brand);
		super.priceInfo(price);
	}
}

class OrdinaryPhone extends Sphones {
	String displayType;

	public void makecall(long number) {
		this.number = number;
		System.out.println("calling ...." + number);
	}
}