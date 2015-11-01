package sudas.com.junit.selenium;

import org.openqa.selenium.WebDriver;

public class Reports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//new Reports().reports();
new test().driver();

	}

	
	
	public void reports()
	{
	Driver driver = new Driver();
	WebDriver webdriver = driver.driver();
	webdriver.close();
	}
	
	
}


class test extends Driver
{
	
	@Override
	public WebDriver driver() {
		// TODO Auto-generated method stub
		return super.driver();
	}
	
}