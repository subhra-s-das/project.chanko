package com.sudas.junit;

import org.hamcrest.Matchers;
import org.hamcrest.*;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class JunitExample {

	public static void main(String[] args) {

	}

	@Test
	public void testOne() {
		// Test for actual and expected result
		String actual = "Apple";
		String expected = "apple";
		// use of assert
		Assert.assertEquals(expected.toLowerCase(), actual.toLowerCase());

	}

	// if condition is true test case fail
	@Test
	public void tesTwo() {
		String actual = "Apple";
		String expected = "apple";
		Assert.assertFalse("This condition is Flase", actual.length() == expected.length());

	}

	@Test
	public void testThree() {
		String actual = "Apple";
		String expected = "apple";

		Assert.assertTrue("This condition is True", actual.length() == expected.length());

	}

	@Test
	public void testFour() {
		String actual = "Apple";
		String expected = "apple";

		Assert.assertThat(actual, Matchers.equalToIgnoringCase(expected));

	}

	@Test
	public void testFive() {
		String actual = "Apple";
		String expected = "apple";

		Assert.assertThat(actual, Matchers.equalToIgnoringCase(expected));

	}

	@Test
	public void testSix() {
		
		int num1[]={10,20,30,40,50};
		int num2[]={10,20,0,40,50};
Assert.assertArrayEquals("All elements in array are equal", num1, num2);
		
	}
	@Rule
	public ErrorCollector collector = new ErrorCollector();
	
	@Test
	public void testSeven() {
		
		int num1[]={10,20,30,40,50};
		int num2[]={10,20,0,40,50};
//Assert.assertArrayEquals("All elements in array are equal", num1, num2);
//		Assert.assertThat(num1, Matchers.equalTo(num2));
		collector.checkThat("Element mismatch", num2, Matchers.equalTo(num1));
				
	}
	
	
	
}
