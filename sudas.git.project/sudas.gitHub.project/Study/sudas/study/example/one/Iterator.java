package sudas.study.example.one;

import java.util.*;

public class Iterator {

	public static void main(String[] args) {
		iteration it = new iteration();
		it.iterations();

	}

}

class iteration {
	public void iterations() {
		// make a array list
		List<String>arraylist1 = new java.util.ArrayList<String>();
		List<Integer>arraylist2 = new java.util.ArrayList<Integer>();

		arraylist1.add("A");
		arraylist1.add("B");
		arraylist1.add("C");
		arraylist1.add("D");
		arraylist1.add("E");
		arraylist1.add("F");
		arraylist1.add("G");
		arraylist1.add("H");

		arraylist2.add(200);
		arraylist2.add(300);
		arraylist2.add(400);
		arraylist2.add(500);
		arraylist2.add(600);
		arraylist2.add(700);
		arraylist2.add(800);
		arraylist2.add(900);

		// get the elements of the array list for every INDEX
		int i;
		for (i = 0; i < arraylist1.size(); i++) {
			System.out.println(arraylist1.get(i));

		}
		java.util.Iterator<String> itr = arraylist1.iterator();
		
while (itr.hasNext())
{
	String test = itr.next();
	System.out.println(test);
}

		

	}

}