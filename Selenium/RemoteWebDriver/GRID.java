package RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GRID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}

	/***
	 * Start the node using the following options
	 */
	/*
	 * java -jar selenium-server-standalone-2.20.0.jar -role webdriver -hub
	 * http://192.168.1.248:4444/grid/register -browser browserName=
	 * "internet explorer",version=8.0,platform=WINDOWS
	 * -Dwebdriver.internetexplorer.driver=C:\selenium\IEDriverServer_x64_2.48.0
	 * \IEDriverServer.exe
	 */

	public void InternetExplorer8a() {
		DesiredCapabilities dcap = DesiredCapabilities.internetExplorer();

		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), dcap);
			driver.get("http://10.0.0.103:8080");

			WebDriver driver1 = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), dcap);
			driver1.get("http://10.0.0.103:8080");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void InternetExplorer8b() {
		DesiredCapabilities dcap = DesiredCapabilities.internetExplorer();

		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), dcap);
			driver.get("http://10.0.0.103:8080");

			WebDriver driver1 = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), dcap);
			driver1.get("http://10.0.0.103:8080");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ie() {
		// DesiredCapabilities capabilities = new
	}

}



class run1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DesiredCapabilities dcap = DesiredCapabilities.internetExplorer();

		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), dcap);
			driver.get("http://10.0.0.103:8080");

			WebDriver driver1 = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), dcap);
			driver1.get("http://10.0.0.103:8080");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


class run2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DesiredCapabilities dcap = DesiredCapabilities.internetExplorer();

		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), dcap);
			driver.get("http://10.0.0.103:8080");

			WebDriver driver1 = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), dcap);
			driver1.get("http://10.0.0.103:8080");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
