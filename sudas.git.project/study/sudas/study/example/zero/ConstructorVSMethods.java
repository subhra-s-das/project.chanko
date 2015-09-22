package sudas.study.example.zero;

public class ConstructorVSMethods {

	// main_class
	public static void main(String[] args) {
		
//		box_name boxname = new box_name(10, 10, 10);
//		boxname.getVolume();
		
		box_name box = new box_name();
		box.setVolume(10, 10, 10);
		box.getVolume();
		
	}

}

// constructor example

class box_name 
{
	
	int length, breadth, height;
	
	//constructor
//	public box_name(int x, int y, int z) 
//	{
//		length =x;
//		breadth=y;
//		height=z;
//		
//	}
	
//setMethod
	void setVolume(int x, int y, int z)
	{

		length =x;
		breadth=y;
		height=z;
	}

	//getMethod
	int getVolume()
	{
		return length*breadth*height;
	}
	
}