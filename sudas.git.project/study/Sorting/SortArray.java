package Sorting;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		String fruits[]={"Orange","Banana","Apple"};
		String fruits01[]={"Apple01","apple02","Apple03","Apple11","Apple33","Apple32","Apple20"};
		Arrays.sort(fruits);

	for (int i=0;i<fruits.length;i++)
	{
		System.out.println(fruits[i]);
	}
	
	Arrays.sort(fruits01);
	for (int i=0;i<fruits01.length;i++)
	{System.out.println(fruits01[i]);
		
	}

	}

}
