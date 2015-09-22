package sudas.study.example.zero;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList<Integer> arraylist = new ArrayList<Integer>();
		List <Integer> arrayList = new ArrayList<Integer>();
		
		for (int i=0;i<=5;i++)
		{
			
			for (int j=0;j<i;j++)
			{
				System.out.println("Out from ArrayList " +arrayList.get(j));
			}
		
			arrayList.add(i);

			System.out.print("\t"+"Out from for loop: "+i);
	
		}
		
		
	}

}


//arrayList.add(100);
//arrayList.add(200);
//arrayList.add(300);
//arrayList.add(400);
