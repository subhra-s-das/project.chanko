package com.sudas.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:9090/WebProject/WebTable.html");
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> th = table.findElements(By.tagName("th"));
		List<WebElement> td = table.findElements(By.tagName("td"));
		Iterator<WebElement> it1 = td.iterator();
		Iterator<WebElement> it2 = th.iterator();
		while (it2.hasNext()) {

			System.out.println(it2.next().getText());
		}
		while (it1.hasNext()) {

			System.out.println(it1.next().getText());

		}

		driver.close();
	}

}
