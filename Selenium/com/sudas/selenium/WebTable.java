package com.sudas.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CheckWebTable().checkTable();
	}

}

class CheckWebTable
{
	WebElement w;
	public void checkTable()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("div"));
		System.out.println(list.size());
		Iterator<WebElement> itr = list.iterator();
		while(itr.hasNext())
		{
				
			System.out.println(itr.next().toString());
			
			String attribute = w.getAttribute(itr.next().toString());
			System.out.println(attribute);
		}
		driver.close();
	}
	
}