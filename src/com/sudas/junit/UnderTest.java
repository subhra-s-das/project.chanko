package com.sudas.junit;

import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Rule;

public class UnderTest {

	public static void main(String[] args) {

	}

	// assertion test
	@Test
	public void test01() {
		String expected[] = { "Apple", "Banana" };
		String actual[] = { "Apple", "Banana" };

		String expected1 = "Apple";
		String actual1 = "Apple";

		byte[] exp1 = expected1.getBytes();
		byte[] act1 = actual1.getBytes();
		Assert.assertArrayEquals(exp1, act1);

	}

	@Test
	public void test02() {
		String expected[] = { "Apple", "gg", "Orange" };
		String actual[] = { "Apple", "Banana", "Orange" };
		// void org.junit.Assert.assertArrayEquals(Object[] expecteds, Object[]actuals)
		Assert.assertArrayEquals(expected, actual);

	}

	@Rule

	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void test03() {
		String expected[] = { "Apple", "tttt", "Grapes" };
		String actual[] = { "Apple", "Banana", "Grapes" };

		// <String[]> void org.junit.rules.ErrorCollector.checkThat(String[]value, Matcher<String[]> matcher)
collector.checkThat(actual, new IsEqual<String[]>(expected));

	}
	
	@Test
	public void test04() {
		String expected[] = { "Apple", "tttt", "Grapes" };
		String actual[] = { "Apple", "Banana", "Grapes" };

//		collector.checkThat("Custom Message", "Apple", matcher);

	}

}
