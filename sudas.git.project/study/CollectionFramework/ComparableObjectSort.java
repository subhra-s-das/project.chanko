package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableObjectSort {

	public static void main(String[] args) {
		// Comparable and Comparator interfaces
		new ComparableObjectSort().comparable();
	}

	public void comparable() {

		OFruit fruit1 = new OFruit();
		fruit1.setName("Palm");
		fruit1.setColour("Red");
		fruit1.setQuantity(10);

		OFruit fruit2 = new OFruit();
		fruit2.setName("Banana");
		fruit2.setColour("Green");
		fruit2.setQuantity(15);

		OFruit fruit3 = new OFruit();
		fruit3.setName("Orange");
		fruit3.setColour("Yellow");
		fruit3.setQuantity(20);
		
		OFruit fruit4 = new OFruit();
		fruit4.setName("StarFruit");
		fruit4.setColour("Green");
		fruit4.setQuantity(2);


		List<OFruit> list = new ArrayList<OFruit>();
		list.add(fruit1);
		list.add(fruit2);
		list.add(fruit3);
		list.add(fruit4);

		// Collections.shuffle(list);
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out
					.println(list.get(i).getName() + '\t' + list.get(i).getColour() + '\t' + list.get(i).getQuantity());
		}

	}

}
