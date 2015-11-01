package sudas.com.junit.selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest extends Driver {

	Login firstLogin;

	@Before
	public void setUp() throws Exception {
		firstLogin = new Login();

	}

	@After
	public void tearDown() throws Exception {
WebDriver driver = new LoginTest().driver();
driver.close();
driver.quit();

	}

	@Test
	public void test() {
		String expected="http://localhost:8080/images/search_icon.png";
assertEquals(expected, );
//		fail("Not yet implemented");
	}

}
