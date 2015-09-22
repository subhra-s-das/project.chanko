package com.bmc.selenium.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.condition.Presence;

public class RefreshReport {

	public static void main (String [] args)
	{
	
System.setProperty("webdriver.chrome.driver", "c:/Selenium/chromedriver.exe");


WebDriver driver1 = new ChromeDriver();



driver1.get("http://vl-pun-atm-qa12:8080/arsys/shared/login.jsp?/arsys/");
driver1.findElement(By.xpath("//*[@id='username-id']")).sendKeys("Demo");
driver1.findElement(By.xpath("//*[@id='pwd-id']")).sendKeys("bmcAdm1n");
driver1.findElement(By.xpath("//*[@id='login']")).click();

new WebDriverWait(driver1, 2).until(ExpectedConditions.presenceOfElementLocated(By.id("reg_img_303633100")));

WebDriver driver2= new ChromeDriver();
driver2.get("http://vl-pun-atm-qa12:8080/arsys/shared/login.jsp?/arsys/");
driver2.findElement(By.xpath("//*[@id='username-id']")).sendKeys("Demo");
driver2.findElement(By.xpath("//*[@id='pwd-id']")).sendKeys("bmcAdm1n");
driver2.findElement(By.xpath("//*[@id='login']")).click();

		
		
	}
	


}
