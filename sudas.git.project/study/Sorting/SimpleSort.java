package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("fipkart","Amazon","ebay","snapdeal","loot","yettocome","aaShipper");
Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
System.out.println(list);
	}

}
