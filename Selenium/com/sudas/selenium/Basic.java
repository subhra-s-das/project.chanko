package com.sudas.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bmc.selenium.qa.WebDriver;
import com.thoughtworks.selenium.Selenium;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new OpenBrowser().open();
			new OpenBrowser().junitTest();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class OpenBrowser {
	FirefoxDriver driver ;
	public void open() throws FileNotFoundException {
		try {
			FileInputStream fis = new FileInputStream(new File("/Users/S_Das/Documents/Java/selenium.properties"));
			Properties prop = new Properties();
			prop.load(fis);


			System.setProperty(prop.getProperty("driver"), prop.getProperty("path"));


			driver= new FirefoxDriver();
			driver.get("http://localhost:9090/WebProject/login.html");
//			driver.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void junitTest()
	{
		WebElement elements = driver.findElementByXPath("#logo > a > img");
//		String text = elements.getText();
//		System.out.println(text);
//		Assert.assertEquals("Subhra", );
	}
}