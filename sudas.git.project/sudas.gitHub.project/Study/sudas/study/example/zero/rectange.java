package sudas.study.example.zero;

public class rectange {

	// find out the area of the triange | example to use class methods and objects
	public static void main(String[] args) {
	// find the area of rectange

		int totalArea;
		area area1 = new area();
		area1.length =10;
		area1.breadth =20;
		
		totalArea = area1.length * area1.breadth;
		System.out.println(totalArea);
		
}
}


class area {
	
	int length;
	int breadth;
	
	// method returns null
	void getData(int x, int y)
	{
	length =x;
	breadth =y;
	
	
}}