package sudas.study.example.zero;

public class PassObjectToMethod {
	
	public static void main (String args[])
	{
		PassObj obj = new PassObj();
		int test = obj.claculateSum(10, 10);
		
		System.out.println(test);
	}

}

class PassObj
{
	// instance variables
	int x;
	int y;

	// create a method calculate sum of x+y
	
	public int claculateSum(int x, int y)
	{
		

		this.x=x;
		this.y=y;
		int sum=x+y;
		return sum;
	}
	
	
	// this method will take the previous method as parameter
	
	public boolean Objcall( PassObj P)
	{
		if (P.x == x) return true;
		else
		return false;

	}
	
	
	
	
}

