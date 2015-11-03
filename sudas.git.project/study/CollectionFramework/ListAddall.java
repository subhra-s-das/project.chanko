package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAddall {

}

class listAddAllExample {
	public void sort() {
		List<String> list1 = Arrays.asList("Hello", "there", "Is", "Home", "cat", "dog");
		List<String> list = new ArrayList<String>();
		list.addAll(list1);
		
		
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
//		
	}
}