package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorAndComparable {

	public static void main(String[] args) {
		new fruitArrayList().fruitArray();
	}

}

// when we are comparing any object then use comparable

class FruitsName implements Comparable<FruitsName> {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(FruitsName o) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(o.getName());
	}

}

class fruitArrayList {
	public void fruitArray() {

		List<FruitsName> fruitnameArray = new ArrayList<>();
		// create a fruit Object
		FruitsName orange = new FruitsName();
		orange.setName("Orange");

		FruitsName apple = new FruitsName();
		apple.setName("apple");

		FruitsName grapes = new FruitsName();
		grapes.setName("Grapes");

		fruitnameArray.add(orange);
		fruitnameArray.add(apple);
		fruitnameArray.add(grapes);

		Collections.sort(fruitnameArray);

		Iterator<FruitsName> itr = fruitnameArray.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getName());
		}
	}

}