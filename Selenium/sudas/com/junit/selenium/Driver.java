package sudas.com.junit.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Framework.ObjectRepo;

public class Driver {

	public WebDriver driver() {
		org.openqa.selenium.WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
