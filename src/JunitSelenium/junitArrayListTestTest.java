package JunitSelenium;

import static org.junit.Assert.*;

import java.util.stream.Collector;

import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class junitArrayListTestTest {
junitArrayListTest jArray;
	@Before
	public void setUp() throws Exception {
		jArray = new junitArrayListTest();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void test1() {
		assertArrayEquals("Test execution", jArray.array1(), jArray.array2());
	}

	@Test
	public void Test2()
	{
		assertThat(jArray.array1(), Matchers.equalTo(jArray.array2()));
	}
	
	@Rule
	public ErrorCollector collector = new ErrorCollector();
	@Test
	public void Test3()
	{
		collector.checkThat(jArray.array1(), Matchers.equalTo(jArray.array2()));
	}
	
}
