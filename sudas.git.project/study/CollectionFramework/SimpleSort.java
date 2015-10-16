package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String City[] = { "Mumbai", "Chennai", "Pune", "Delhi", "Bhubaneshwar", "Agartala" };
		// Simple sorting the array
		Arrays.sort(City);

		for (int i = 0; i < City.length; i++) {
			System.out.println(City[i]); // this would be a sorted output

		}

		/*
		 * if you want to pick the elements from array randomly put the array
		 * Elements in array list and use Collections.shuffle(list);
		 */
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < City.length; i++) {
			list.add(City[i]);

			Collections.shuffle(list);

			System.out.println("Shuffle from array list " + list.get(i));
		}

	}

}