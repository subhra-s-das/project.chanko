package Sandbox;

public class Fruits {

	public static void main(String[] args) {
		
		// create an instance of the class CreateFruitArray
//		CreateFruitArray f = new CreateFruitArray();
//		System.out.println(f.getName());
		
		CreateFruitArray f1 = new CreateFruitArray("Orange", "orange");
		System.out.println(f1.getName());
		
	}

}


class CreateFruitArray
{
	String name;
	String color;
	
	public CreateFruitArray(String name, String color) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	
}