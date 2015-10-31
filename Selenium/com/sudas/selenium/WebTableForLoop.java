package com.sudas.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableForLoop {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:9090/WebProject/WebTable.html");
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> td = table.findElements(By.tagName("td"));
		for (int j = 0; j < td.size(); j++) {

			System.out.println(td.get(j).getText());

		}

		driver.close();
	}
}
