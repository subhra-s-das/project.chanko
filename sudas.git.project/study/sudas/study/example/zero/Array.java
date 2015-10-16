package sudas.study.example.zero;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {

		String array[] = new String[3];

		array[0] = "Apple";
		array[1] = "Banana";
		array[2] = "Orange";

		ArrayList<String> list = new ArrayList<String>();
		int i;
		for (i = 0; i < array.length; i++) {
			list.add(array[i]);

			System.out.println(list.get(i));
}

	}

	public void arrayExample() {
		
		

	}
}
