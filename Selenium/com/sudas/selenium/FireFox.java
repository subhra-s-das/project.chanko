package com.sudas.selenium;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;



public class FireFox {

	public FireFox() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OpenFirefox firefox = new OpenFirefox();
firefox.open();
	}

}


class OpenFirefox
{
	public void open()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://localhost:9090/WebProject/login.html");
		Options option = driver.manage();
	}
}