package com.sudas.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bmc.selenium.qa.WebDriver;

public class Tables extends SeleniumMain {

	public static void main(String[] args) {

		new TestWebTables().createProperties();
		new TestWebTables().readWebTables();

	}

}

class TestWebTables extends SeleniumMain {
	static String WEB_PAGE;

	@Override
	public void createProperties() {
		// TODO Auto-generated method stub
		super.createProperties();
		TestWebTables.WEB_PAGE = URL;
	}

	public void readWebTables() {
		org.openqa.selenium.WebDriver driver = new FirefoxDriver();
		driver.get(WEB_PAGE);
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		Iterator<WebElement> itr1 = rows.iterator();

		/***
		 * READING WEB TABLE THROUGH WHILE LOOP
		 */
		// for getting the header cells
		List<WebElement> headerCells = itr1.next().findElements(By.tagName("th"));
		Iterator<WebElement> itr2 = headerCells.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next().getText());

		}

		// for getting each column
		while (itr1.hasNext()) {

			List<WebElement> cells = itr1.next().findElements(By.tagName("td"));
			Iterator<WebElement> itr3 = cells.iterator();
			while (itr3.hasNext()) {
				System.out.println(itr3.next().getText());
			}

		}

		/***
		 * READING WEB TABLE THROUGH FOR LOOP
		 * 
		 */
		// loop for tr
		for (int i = 0; i < rows.size(); i++) {
			// loop for th within tr
			List<WebElement> list1 = table.findElements(By.tagName("th"));
			for (int j = 0; j < list1.size(); j++) {
				System.out.println(list1.get(j).getText());

			}

		}

		driver.close();
	}

}