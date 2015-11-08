package HTMLUnitDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HTMLunit().getBrowser();

	}

}

class HTMLunit {
	public void unitDriver() {

		// HtmlUnitDriver driver = new HtmlUnitDriver(new
		// BrowserVersion("Chrome", applicationVersion, userAgent,
		// browserVersionNumeric), true);
	}

	public void getBrowser() {

		// RemoteWebDriver driver = new RemoteWebDriver(new
		// DesiredCapabilities());

		WebDriver driver = new FirefoxDriver();
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		System.out.println(caps.getBrowserName());
		System.out.println(caps.getVersion());
		System.out.println(caps.getPlatform());

	}

	public void capabilities()
	{
		
	}
	
}