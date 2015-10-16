package sudas.study.example.zero;

public class Parameter_Constructor {

	public static void main(String[] args) {
		
		drop_box box_01 = new drop_box(10,10,10);
		drop_box box_02 = new drop_box(20,20,20);
		
		int total_volume;
		total_volume = box_01.volume();
System.out.println(total_volume);

total_volume = box_02.volume();
System.out.println(total_volume);
	}

}

class drop_box
{	
int length, breadth, height;

//constructor
drop_box(int l, int b, int h)
{
	length =l;
	breadth=b;
	height=h;
}
	
// initialize volume

int volume ()
{
	return length*breadth*height;
}
	
}