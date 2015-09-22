package sudas.study.example.one;

public class Inheritance04 {
	public static void main (String args[])
	{

		typeCasting casting = new typeCasting();
		casting.typecast(10);
	
	
	}

}

class typeCasting 
{
	public int number;
	
	public void typecast(int typeCastNumber)
	{
		number = typeCastNumber;
		

String num=Integer.toString(number);
	
		
	}
	
	
}

