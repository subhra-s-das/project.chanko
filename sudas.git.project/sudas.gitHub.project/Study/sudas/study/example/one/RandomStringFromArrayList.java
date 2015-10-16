package sudas.study.example.one;

import java.util.ArrayList;
import java.util.Collections;

public class RandomStringFromArrayList {

	public static void main(String[] args) {

		// create a 1D Array
		String companyName[] = { "Apple", "HTC", "Samsung", "Microsoft" };

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < companyName.length; i++) {
			list.add(i, companyName[i]);
		}

		for (int j = 1; j <= 1; j++) {
			Collections.shuffle(list);
			String CompanyName = list.get(0);
			System.out.println(CompanyName);
		}
	}

}
