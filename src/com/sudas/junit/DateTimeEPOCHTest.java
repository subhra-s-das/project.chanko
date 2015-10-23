package com.sudas.junit;

import static org.junit.Assert.*;

import java.util.Date;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.mockito.internal.matchers.Equals;

public class DateTimeEPOCHTest {

	DateTime datetime;
	DateTime datetime1;

	@BeforeClass
	public static void setUpBeforeClass() throws ExceptionNotWorking {
	}

	@AfterClass
	public static void tearDownAfterClass() throws ExceptionNotWorking {
	}

	@Before
	public void setUp() throws ExceptionNotWorking {
		datetime = new DateTime();
		datetime1 = new DateTime();

	}

	@After
	public void tearDown() throws ExceptionNotWorking {
	}

	// Date Time to EPOCH conversion
	@Test
	public void testDateTimeToEpoch() {
		datetime.setDateTime("10/15/2015 01:00:00");
		long epoch = datetime.getEpoch();
		long actual = 1444847400;
		// assertEquals(epoch, actual);
		assertEquals(epoch, actual);
		// fail("Not yet implemented");
	}

	// EPOCH to Date Time conversion IST
	@Test
	public void Test01() {
		String dateArray[] = { "10/15/2015 00:00:00", "10/15/2015 00:00:01", "10/15/2015 00:00:02" };
		long actualEPOCH[] = { 1444847400, 1444847403, 1444847402 };
		for (int i = 0; i < dateArray.length; i++) {

			datetime1.setDateTime(dateArray[i]);
			long epoch = datetime1.getEpoch();
			if (i < actualEPOCH.length) {
				long actual = actualEPOCH[i];
				assertEquals(epoch, actual);
			}
		}

	}

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	// EPOCH to Date Time conversion IST
	@Test
	public void Test02() {
		String dateArray[] = { "10/15/2015 00:00:00", "10/15/2015 00:00:01", "10/15/2015 00:00:02" };
		long actualEPOCH[] = { 1444847404, 1444847401, 1444847402 };
		for (int i = 0; i < dateArray.length; i++) {

			datetime1.setDateTime(dateArray[i]);
			long epoch = datetime1.getEpoch();
			if (i < actualEPOCH.length) {
				long actual = actualEPOCH[i];
				new Matchers();
				// assertEquals(epoch, actual);
				collector.checkThat(epoch, Matchers.equalTo(actual));
			}
		}

	}

}
