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

		new FindWebElements().find_href();
	}

}

class FindWebElements
{
	WebElement w;
	public void find_href()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		Iterator<WebElement> itr = list.iterator();
		while(itr.hasNext())
		{
				
			System.out.println(itr.next().getAttribute("href"));
			
//			String attribute = w.getAttribute("href");
//			System.out.println(attribute);
		}
		driver.close();
	}
	
	public void getWebTable()
	{
		
	}
	
}