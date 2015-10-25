package sudas.study.example.zero;

public class JavaInANutShell {

	public static void main(String[] args) {

		// create an instance of the class laptop and create different laptops

		Laptops apple = new Laptops();
		apple.setName("Apple laptop from super class ***Laptops***");
		String appleLaptop = apple.getName();
		System.out.println(appleLaptop);

		Laptops sony = new Laptops();
		Laptops lenovo = new Laptops();
		
		MobilePC mobilepc1 = new MobilePC();
		
		// this is called autoboxing where lower objects are automatically converted
		MobilePC mobilepc2 = (MobilePC) new Laptops();

		// or even this is legal. This is called polymorphism
		Laptops laptops = new MobilePC();
		
	}

}

class Laptops {
	// Fields
	String name;
	String model;
	double price;

	// getters and setters for laptop
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

class MobilePC extends Laptops {
	// when I extend a class all the instance variable and instance methods from
	// parent class are available to the child class

	// this is an overridden version of the setName method from the parent
	// class.
	// @Override means a new version of the method.
	// super.setName(name) is actually calling the super class methods
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
}
