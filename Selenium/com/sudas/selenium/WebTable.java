package com.sudas.selenium;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FindWebElements().find_href();
		new FindWebElements().twoDarray();
	}

}

class FindWebElements {
	// you can create a cnstructor for the connection

	public static WebDriver driver() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		return driver;
	}

//	WebDriver driver;
//
//	
//	public void before() {
//		this.driver = new FindWebElements().driver();
//		if(driver==null)
//		{
//			System.out.println("driver is null");
//		}
//		else 
//		{
//			System.out.println(driver);
//		}
//	}

	public void find_href() {
		
		new FindWebElements();
		List<WebElement> list = FindWebElements.driver().findElements(By.tagName("a"));
		System.out.println(list.size());
		Iterator<WebElement> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next().getAttribute("href"));

			// String attribute = w.getAttribute("href");
			// System.out.println(attribute);
		}
		new FindWebElements();
		FindWebElements.driver().close();
	}

	// Before we know how to read a web table
	// let us try to understand a 2D array which is a table
	public void twoDarray() {
		// an array of 3X4 3rows and 4columns
		String array[][] = { { "A1", "B1", "C1", "D1" }, { "A2", "B2", "C2", "D2" }, { "A3", "B3" } };
		// an array of 3X4 3rows and 4columns
		String arrays[][] = new String[3][4];
		// lets print this array
		for (int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.println(array[i][j]);
			}
		}
		
	}

	public void getWebTable() {
		WebElement webtable = FindWebElements.driver().findElement(By.tagName("tr"));
	String headerRow = webtable.getAttribute("th");	
	System.out.println(headerRow);
	
	}

}