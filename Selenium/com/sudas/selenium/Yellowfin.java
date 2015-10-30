package com.sudas.selenium;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yellowfin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new YellowfinSelenium().testLoginScreen();
		new YellowfinSelenium().login();

	}

}

class YellowfinSelenium

{
	@Test
	public void testLoginScreen() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/");
		driver.manage().window().maximize();
		List<WebElement> imageElements = driver.findElements(By.tagName("img"));
		Iterator<WebElement> itr = imageElements.iterator();
		while (itr.hasNext()) {
			String source = itr.next().getAttribute("src");
			System.out.println(source);
		}

		driver.close();
	}

	public void login() {

		String namearray[] = { "org", "INDEX_PAGE", "action",
				"clientReferenceId", "email", "password" };
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.println(elements.size());
		Iterator<WebElement> itr = elements.iterator();
		while (itr.hasNext()) {
			String nameAttribute = itr.next().getAttribute("name");
			System.out.println(nameAttribute);
		}

		driver.close();

	}

}
