package CollectionFramework;

public class OFruit implements Comparable<OFruit> {
	String name;
	String colour;
	int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public int compareTo(OFruit fruit) {
		return this.name.compareTo(fruit.getName());

	}

}
