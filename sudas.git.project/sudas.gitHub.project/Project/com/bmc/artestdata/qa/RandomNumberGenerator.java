package com.bmc.artestdata.qa;

import java.util.ArrayList;
import java.util.Collections;

public class RandomNumberGenerator {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			list.add(i + 1);
		}

		Collections.shuffle(list);

		for (int j = 0; j < list.size(); j++) {

			Integer random = list.get(j);
			System.out.println(random);

		}

	}
}
