package Sorting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CapabilitiesUsage {

	public static void main(String[] args) {
		FirefoxDriver fdriver = new FirefoxDriver();
		Capabilities cap = fdriver.getCapabilities();
		
		try {
			RemoteWebDriver driver = new RemoteWebDriver(new URL(""), new FirefoxDriver().getCapabilities());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
