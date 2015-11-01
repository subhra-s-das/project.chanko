package sudas.com.junit.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Login extends Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException {

	}


	public void login() {
		WebDriver driver = new Login().driver();

		Platform p = Platform.getCurrent();
		System.out.println(p.name());

		File file = new File("/Users/S_Das/csspath.properties");
		Properties property = new Properties();
		try {
			property.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.cssSelector(property.getProperty("username")));
		WebElement passwd = driver.findElement(By.cssSelector(property.getProperty("password")));
		WebElement log = driver.findElement(By.cssSelector(property.getProperty("loginButton")));
		uname.clear();
		uname.sendKeys(property.getProperty("sendUserName"));
		passwd.clear();
		passwd.sendKeys(property.getProperty("sendPassword"));
		log.click();
		WebElement validationImage = driver.findElement(By.cssSelector(property.getProperty("validationImage")));
		String imgAttribute = validationImage.getAttribute("src");
//		return imgAttribute;

	}
}
