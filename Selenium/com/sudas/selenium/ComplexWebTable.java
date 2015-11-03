package com.sudas.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ComplexWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:9090/WebProject/WebTable.html");
		
WebElement element1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[5]/a"));
System.out.println(element1.getText());
	
	}

}
