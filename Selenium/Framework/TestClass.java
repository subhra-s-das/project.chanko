package Framework;

import java.util.Iterator;
import java.util.List;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass extends WebElementProperties {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get(getURL());
		LoginPage.userName(driver).clear();
		LoginPage.userName(driver).sendKeys(getS_USR_NAME());
		LoginPage.password(driver).clear();
		LoginPage.password(driver).sendKeys(getS_PASSWD());
		LoginPage.LoginButton(driver).click();
		Reports.browse(driver).click();
		Reports.getReportsJS(driver);

		List<String> list = Reports.getReportsJS(driver);
		for (int i = 60; i < list.size(); i++) {

			String JScripts = list.get(i);
			System.out.println(JScripts);

		}
	}
}
