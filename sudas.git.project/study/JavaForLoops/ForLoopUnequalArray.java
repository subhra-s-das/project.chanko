package JavaForLoops;

import java.util.ArrayList;
import java.util.List;

public class ForLoopUnequalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new ForLoopUnequalArray().accessArray();
		new ForLoopUnequalArray().unequalArray();
	}

	String firstName[] = { "sudas", "pdas", "sdas" };
	String lastName[] = { "das1", "das2" };
	
	
	List<String> arraylist = new ArrayList<String>();
	
	

	// access both the array together in nested for loop

	public void accessArray() {
		for (int i = 0; i < firstName.length; i++) {
			System.out.println(firstName[i]);

			for (int j = i; j <= i; j++) {

				System.out.println(lastName[j]);

			}

		}
	}
	
	public void unequalArray()
	{
		
		
	}

}
