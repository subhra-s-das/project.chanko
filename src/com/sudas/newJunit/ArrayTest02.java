package com.sudas.newJunit;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest02 {
	
	@Test
	public void test02() {
		int number1[] = { 10, 20, 30, 40 };
		int number2[] = { 10, 20, 30, 40 };

		Assert.assertArrayEquals(number1, number2);
	}

}
