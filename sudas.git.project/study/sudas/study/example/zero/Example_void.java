package sudas.study.example.zero;

public class Example_void {

	public static void main(String[] args) {
		
		rectangle box_01 = new rectangle();
		int total_volume;
		box_01.breadth=10;
		box_01.length=10;
		
				total_volume= box_01.breadth*box_01.length;
						System.out.println(total_volume);
	}
}

// calculate the area of a rectangle l*b*h

// class
class rectangle
{
	// method 
	int length, breadth;
	void volume (int x, int y)
	{
	x = length;
	y = breadth;
	}
	
}