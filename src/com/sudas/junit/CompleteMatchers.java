package com.sudas.junit;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;

public class CompleteMatchers {
	public static void main(String[] args) {
		
	}
	

	@Test
	public void Test1() {
		int num1[] = { 10, 20, 30, 40, 50 };
		int num2[] = { 10, 20, 0, 40, 50 };
		String str1[] = { "Apple", "Banana", "Orange" };
		String str2[] = { "apple", "banana", "orange" };

		// use of junit asset matcher
		assertEquals(str1, str2);
		
//		assertThat(str1, new Matchers().anything("just matches"));
	}

}