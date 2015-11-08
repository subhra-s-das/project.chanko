package RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ParallelGRID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GRIDRun1 r1 = new GRIDRun1();
		GRIDRun2 r2 = new GRIDRun2();
		GRIDRun3 r3 = new GRIDRun3();
		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start();
	}

}

class GRIDRun1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

		capabilities.setPlatform(Platform.ANY);
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), capabilities);
			driver.get("http://10.0.0.103:8080");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class GRIDRun2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

		capabilities.setPlatform(Platform.ANY);
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), capabilities);
			driver.get("http://www.google.com");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class GRIDRun3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		capabilities.setPlatform(Platform.ANY);
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.104:5555/wd/hub"), capabilities);
			driver.get("http://www.google.com");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}