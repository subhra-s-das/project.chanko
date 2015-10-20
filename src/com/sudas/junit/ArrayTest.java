package com.sudas.junit;

import java.util.ArrayList;

import org.hamcrest.Matcher;
//import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ArrayTest {

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void test01() {
		String actual[] = { "apple", "banana", "orange" };
		String expected[] = { "apple", "Banana", "orange" };

		// Assert.assertArrayEquals(expected, actual);
//		collector.checkThat(expected, new Matchers().equalTo(actual));


	}

}
