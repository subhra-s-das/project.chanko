package Sandbox;

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple newApple = new Apple("Green Apple");
		System.out.println("newApple hash : " + newApple);

		newApple.calculateQuantity();
		newApple.testThis();
		System.out.println("newApple "+newApple);
	}

}

class Apple {
	String name;

	public Apple(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
		System.out.println("costructor this hash : " + this);
	}

	public void calculateQuantity() {

		System.out.println("this hash : " + this);
	}

	public void testThis() {
		Apple apples = new Apple("Red Apple");
		System.out.println("apples hash : " + apples);
		System.out.println("this hash : " + this);
	}

}