package sudas.study.example.zero;

public class MethodOverriding {

	public static void main(String[] args) {
		
		
	}

}

class MobilePhone
{
	double length;
	double breadth;
	double width;
	
	public MobilePhone(double length, double breadth, double width)
	{
		this.length=length;
		this.breadth=breadth;
		this.width=width;
	}
	
	public double printvolume()
	{

		{
			double volume=(length*breadth*width);
			return volume;
		}
	}
	
	public void printinfo()
	{
		System.out.println("Superclass");
	}
	
	
	
	
}

class SmartPhone1 extends MobilePhone
{
	public SmartPhone1(double length, double breadth, double width)
	{
		super (length,breadth,width);
	}
	
	
	@Override
	public double printvolume() {

	double newVolume=(length*breadth*width)*2;
	return newVolume;
	}
	
	@Override
	public void printinfo() {
		// TODO Auto-generated method stub
		super.printinfo();
	}
	
	
	
	
}

class SimplePhone  extends MobilePhone
{

	public SimplePhone(double length, double breadth, double width) {
		super(length, breadth, width);

	}
	
}
