package com.sudas.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sudas.junit.Calculator.NewException;

public class ExceptionClassTest {
	// call the class and assign a class variable
	Calculator exception;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// create an object instantiate the class
		exception = new Calculator();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected = NumberFormatException.class)
	public void testMain() {
		exception.addition("10.1","10.0");
		
//		fail("Not yet implemented");
	}

}
