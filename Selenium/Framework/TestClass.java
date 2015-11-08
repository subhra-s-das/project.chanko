package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class TestClass extends ObjectRepo {
	static WebDriver driver;
	static String value;

	public static void main(String[] args) {
		// TestClass.test();
		TestClass.report26();

	}

	public static String getJS(String key) {

		try {
			File file = new File("/Users/S_Das/js.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties property = new Properties();
			property.load(fis);
			value = property.getProperty(key);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	public static void report1() {
		driver = new FirefoxDriver();
		driver.get(getURL());
		LoginPage.userName(driver).clear();
		LoginPage.userName(driver).sendKeys(getS_USR_NAME());
		LoginPage.password(driver).clear();
		LoginPage.password(driver).sendKeys(getS_PASSWD());
		LoginPage.LoginButton(driver).click();
		Reports.browse(driver).click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(getJS("report6"));

	}

	public static void report26() {
		driver = new FirefoxDriver();
		driver.get(getURL());
		LoginPage.userName(driver).clear();
		LoginPage.userName(driver).sendKeys(getS_USR_NAME());
		LoginPage.password(driver).clear();
		LoginPage.password(driver).sendKeys(getS_PASSWD());
		LoginPage.LoginButton(driver).click();
		Reports.browse(driver).click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(getJS("report26"));

		new WebDriverWait(driver, 5).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='reportImg53904-img053904-53905-0Canvas']")));

		driver.close();
	}

}