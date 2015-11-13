package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {

		String s1 = "Logitech";
		String s2 = "Microsoft";
		String s3 = "cooler Master";
		String s4 = "Creative";
		String s5 = "Zebronics";
		String s6 = "iBall";

		List<String> arrayList = new ArrayList<String>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);
		arrayList.add(s6);
	

		/*
		 * as long as all the names have same case the starting alphabet the
		 * sort method works Collections.sort(arrayList);
		 */

		Collections.sort(arrayList, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
				// return 0;
			}

		});

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}

}
