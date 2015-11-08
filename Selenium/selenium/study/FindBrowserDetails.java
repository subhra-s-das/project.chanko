package selenium.study;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FindBrowserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BrowserDetails().browser();

	}

}

class BrowserDetails
{
	public void browser()
	{
		FirefoxDriver driver = new FirefoxDriver();
		Capabilities cap = driver.getCapabilities();
		System.out.println(cap.getBrowserName());
		System.out.println(cap.getVersion());
		System.out.println(cap.isJavascriptEnabled());
		System.out.println(cap.getPlatform());
		driver.close();
		driver.quit();
	}
}
