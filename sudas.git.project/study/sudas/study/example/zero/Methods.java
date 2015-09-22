package sudas.study.example.zero;

public class Methods {

	public static void main(String[] args) {
		
		Method method = new Method();
		method.arrayMethod("Apple", null, null, null);
		
		
	}

}

class Method
{
	String fruitArray[] = {null,null,null,null};

	//method to return 
	
	public void arrayMethod(String x, String y, String z, String h)
	{
		for (int i=0;i<fruitArray.length;i++)
		{
			
		fruitArray[i]=x;
		System.out.println(fruitArray[i].toUpperCase());
		
		}
	}
	
	
}