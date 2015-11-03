package very.basics;

public class CoreConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flowers flower = new Flowers();
		flower.setColour("blue");
		flower.setName("BlueFlower");

	}

}

class Flowers {
	String colour;
	String name;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}