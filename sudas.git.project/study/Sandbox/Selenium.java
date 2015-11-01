package Sandbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	public static void main(String[] args) {
		Selenium.driver();
		new search().reuser();
	}

	public static WebDriver driver()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		return driver;
	}
	
}

class search
{
	public void reuser()
	{
		WebDriver driver = Selenium.driver();
		driver.close();
	}
}
