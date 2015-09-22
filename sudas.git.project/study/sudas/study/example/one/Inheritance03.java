package sudas.study.example.one;

public class Inheritance03 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.info();
		
		HyundaiCar c2 = new HyundaiCar();
		c2.info("Verna CRDi");

	}

}


class Car
{
	String type= "HatchBack";
	String color="black";
	double weight;
	
	public void info()
	{
	
		System.out.println(color);
	}
}

class HyundaiCar extends Car
{
	String model;
	double bhp;
	
	public void info(String model)
	{
		this.model=model;
		System.out.println(model);
		super.info();
	}
	
	
	
}