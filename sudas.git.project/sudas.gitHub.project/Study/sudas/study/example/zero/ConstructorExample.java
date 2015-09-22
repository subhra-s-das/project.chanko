package sudas.study.example.zero;

public class ConstructorExample {

	public static void main(String[] args) {
		
	//object 1 (instance of class)
	Computer mycomputer1 = new Computer();
	System.out.println(mycomputer1.brand);
// object 2 (instance of class)
	
	Computer mycomputer2 = new Computer("Dell","Dell-123",1000);
			System.out.println(mycomputer2.brand);
		}
}
class Computer
{
	// instance variable
	String brand;
	String model;
	double price;
	
	//constructor
	public Computer()
	{
		brand="HP";
		model="1234-A";
		price=100.99;	
		}
	
	//parameter constructor
	
	public Computer(String x, String y, int z)
	{
		brand=x;
		model=y;
		price=z;	
		}
	
}
