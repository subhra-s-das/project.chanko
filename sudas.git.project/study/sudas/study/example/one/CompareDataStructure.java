package sudas.study.example.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CompareDataStructure {

	public static void main(String[] args) {
		CompareDataStructure compare = new CompareDataStructure();
		compare.compareArray();

		compare.compareArrayList();

	}

	// Method to compare content of ARRAYS
	public void compareArray() {
		String fruits1[] = { "Apple", "Banana", "Orange" };
		String fruits2[] = { "Apple", "Banana", "Orange" };

		if (Arrays.equals(fruits1, fruits2)) {
			System.out.println("Content of Array SAME");
		}
		else{
		System.out.println("Content of Array DIFFERs");
	}
	}
	public void compareArrayList() {
		List<String> arrayList1 = new ArrayList<String>();
		List<String> arrayList2 = new ArrayList<String>();
		String fruits1[] = { "Apple", "Banana", "Orange" };
		String fruits2[] = { "Apple", "Banana", "Palm" };
		for (int i = 0; i < fruits1.length; i++) {
			String fruit = fruits1[i];
			arrayList1.add(i, fruit);

		}

		for (int i = 0; i < fruits2.length; i++) {
			String fruit = fruits2[i];
			arrayList2.add(i, fruit);

		}

		// compare array lists
		if (arrayList1.equals(arrayList2)) {
			System.out.println("Content of ArrayList SAME");
		} else {
			System.out.println("Content of ArrayList DIFFERs");
		}
	}

}