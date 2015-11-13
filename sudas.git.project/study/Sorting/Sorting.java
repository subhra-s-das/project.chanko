package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// new Sort1().sort1();
		new Sort3().sort3();
		new UseOfAddAll().collection();

	}

}

// Simple sorting of a String array
// The sorting will work as long as all the elements has same case.
class Sort1 {
	public void sort1()

	{
		String fruits[] = { "Orange", "banana", "apple" };
		String fruits01[] = { "Apple01", "apple02", "Apple03", "Apple11", "Apple33", "Apple32", "Apple20" };
		Arrays.sort(fruits);

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		Arrays.sort(fruits01);
		for (int i = 0; i < fruits01.length; i++) {
			System.out.println(fruits01[i]);

		}

	}
}

// Simple sorting of a String array
// The sorting will work even with mix case
class Sort2 {
	public void sort2() {
		String fruits[] = { "Orange", "banana", "apple" };
		Arrays.sort(fruits, String.CASE_INSENSITIVE_ORDER);

		// converting Array into list and then use iterate
		List<String> list = Arrays.asList(fruits);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());

		}
	}

}

// sorting a list
class Sort3 {
	public void sort3() {
		List<String> list1 = Arrays.asList("Orange", "banana", "apple");
		List<String> list2 = list1.subList(0, list1.size());
		Collections.sort(list1, String.CASE_INSENSITIVE_ORDER);
		System.out.println(list1);
	}
}

// Using of the MIGHTY COMPARATOR
class Laptops {
	public void laptops() {
		String l1 = "Sony";
		String l2 = "apple";
		String l3 = "chrome";
		String l4 = "Dell";
		
		
		List<String> list = new ArrayList<String>();
	
	}
}


// collection 
class UseOfAddAll
{
	public void collection()
	{
		List<String> f1 = Arrays.asList("Orange", "banana", "apple");
		List<String> f2 = Arrays.asList("Grapes", "pinaple", "kiewe");
		
		List<String> allfruits = new ArrayList<String>();
		allfruits.addAll(f1);
		allfruits.addAll(f2);
		
		Collections.sort(allfruits, String.CASE_INSENSITIVE_ORDER);
		System.out.println(allfruits);
		
		
	}
}
