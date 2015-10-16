package sudas.study.example.zero;

public class DoubleBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calculate are of two boxes individually
		
		area_01 new_area_01 = new area_01();
		
		area_01 new_area_02 = new area_01();
		
		int areFirstBox;
		int areaSecBox;
		
		new_area_01.length= 10;
		new_area_01.breadth=20;
		
		new_area_02.length=10;
		new_area_02.breadth=30;
		
		// area = length X breadth
		areFirstBox =  new_area_01.length *new_area_01.breadth;
				areaSecBox = new_area_02.length*new_area_02.breadth;
			
				System.out.print("area of fisrst box is :" +areFirstBox);
System.out.println(areaSecBox);
	}

}

class area_01 {
	// method
	int length, breadth;
	
	//method
	void getData(int x, int y)
	{
	length =x;
	breadth =y;
	}	
}
