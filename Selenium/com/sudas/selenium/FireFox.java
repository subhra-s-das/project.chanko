package com.sudas.selenium;

import org.junit.Test;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bmc.selenium.qa.WebDriver;
import com.thoughtworks.selenium.Selenium;

public class FireFox {

	public FireFox() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireFox ffox = new FireFox();
		ffox.open();

	}

	org.openqa.selenium.WebDriver driver;

	@Test
	public void open() {
		// FirefoxDriver driver = new FirefoxDriver();
		driver = new FirefoxDriver();
		driver.get("http://localhost:9090/WebProject/login.html");
		Options options = driver.manage();

		options.window().maximize();
		WebElement element1 = driver.findElement(new By.ById("errorTitleText"));
		System.out.println(element1.getText());
		driver.close();

		String expected="Unable to connect";
		assertEquals(expected, element1.getText());
//		assertTrue(element1.getText() == "Unable to connect");
		 
	}

}
