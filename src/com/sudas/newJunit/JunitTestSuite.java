package com.sudas.newJunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


	
	@RunWith(Suite.class)
	
//	@Suite.SuiteClasses({ 
//	   calc.class,ArrayTest.class
//	})
	
	@SuiteClasses
	({ArrayTest01.class,ArrayTest02.class})
	public class JunitTestSuite {
		
	}


