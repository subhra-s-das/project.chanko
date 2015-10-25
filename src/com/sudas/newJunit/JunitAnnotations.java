package com.sudas.newJunit;

import static org.junit.Assert.*;

import java.io.PrintWriter;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotations {
	Calculators calc1;
	Calculators calc2;
	Calculators calc3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calc1 = new Calculators("10", "10");
		calc2 = new Calculators("10.1", "10.1", "10.1");
		calc3 = new Calculators("10.1", "10.1", "10.1", "10.1");

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AdditionTwoNumbers() {

//		assertEquals(20.21, calc1.twoDigitAddition(), 0);
//		assertThat(calc1.twoDigitAddition(), new Matchers().equalTo(20.21));
		assertTrue(calc1.twoDigitAddition()==20.1);
	}

	@Test
	public void AdditionThreeNumbers() {

		assertEquals(60.3, calc2.threeDigitAddition(), 0);
	}

	@Test
	public void AdditionFourNumbers() {
		assertEquals(80.4, calc3.FourDigitAddition(), 0);

	}

}
