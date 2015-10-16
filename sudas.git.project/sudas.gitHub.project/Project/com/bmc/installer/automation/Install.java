package com.bmc.installer.automation;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;

import java.util.zip.ZipInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Install {

	public static void main(String[] args) {
		String input = "C:\\Users\\Administrator\\Downloads\\ARSuiteKitWindows9.0.01.zip";
		String destination = "C:\\Automation\\AR.Installer";

		Unzipping zip = new Unzipping();
		zip.unzip(input, destination);
		zip.silent();
//		zip.testMethod();
		zip.SmartReporting("vl-pun-atm-qa12", "0", "Demo", "bmcAdm1n","http://clm-pun-015281:94/onboarding","http://clm-pun-015281:94");
//		zip.SmartReporting("http://clm-pun-015281:94");
		
	}

}

class Unzipping {
	public void unzip(String input, String destination) {
	

		FileInputStream in;
		byte[] buffer = new byte[1024];
		try {
			in = new FileInputStream(input);
			ZipInputStream zis = new ZipInputStream(in);

			ZipEntry zipentry = null;

			while ((zipentry = zis.getNextEntry()) != null) {
				String zipfilename = zipentry.getName();
				// System.out.println(zipfilename);

				File file = new File(destination + '/' + zipfilename);
				System.out.println(destination + '/' + zipfilename);

				if (zipentry.isDirectory()) {
					if (zipfilename.endsWith("/")) {
						file.mkdirs();
					}
				}

				else {

					// System.out.println("parent "+file.getParent());
					// System.out.println("name "+file.getName());
					// System.out.println("absolute path "+file.getAbsolutePath());

					FileOutputStream fos = new FileOutputStream(file);
					int length;
					while ((length = zis.read(buffer)) > 0) {
						fos.write(buffer, 0, length);
					}

					fos.close();
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void silent()
	{
			try {
			Process process = Runtime.getRuntime().exec("cmd /c start /wait c:/Install.bat");
			process.waitFor();
			int exitValue = process.exitValue();
			System.out.println(exitValue);
			
		} 
	
		catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
		
	public void SmartReporting(String arserver,String port,String aradmin,String aradminPassword,String driver1URL,String driver2URL )
	{

		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get(driver1URL);
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//*[@id='tenant_name']")).sendKeys("bmc");
		driver1.findElement(By.xpath("//*[@id='itsm_host']")).sendKeys(arserver);
		driver1.findElement(By.xpath("//*[@id='itsm_port']")).sendKeys(port);
		driver1.findElement(By.xpath("//*[@id='itsm_admin_user']")).sendKeys(aradmin);
		driver1.findElement(By.xpath("//*[@id='itsm_admin_password']")).sendKeys(aradminPassword);
//		driver1.findElement(By.xpath("//*[@id='yf_admin_user']")).sendKeys("siadmin");
		driver1.findElement(By.xpath("//*[@id='yf_admin_password']")).sendKeys("siadmin");
		driver1.findElement(By.xpath("//*[@id='tenant_admin_user']")).sendKeys("Buser");
		driver1.findElement(By.xpath("//*[@id='saveForm']")).click();
		driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver1.findElement(By.xpath("//*[@id='saveForm']")).click();
		
		//wait for
		new WebDriverWait(driver1, 12).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='main_body']/h4/table/tbody/tr[1]/td")));
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.get(driver2URL);
driver2.manage().window().maximize();
driver2.findElement(By.xpath("/html/body/div[1]/div/form/table/tbody/tr/td[3]/table/tbody/tr[1]/td[2]/div/input")).clear();
driver2.findElement(By.xpath("/html/body/div[1]/div/form/table/tbody/tr/td[3]/table/tbody/tr[1]/td[2]/div/input")).sendKeys("siadmin");
driver2.findElement(By.xpath("/html/body/div[1]/div/form/table/tbody/tr/td[3]/table/tbody/tr[1]/td[3]/div/input")).sendKeys("siadmin");
driver2.findElement(By.id("logonButton")).click();
		
	}
	
	
	/*public void OpenSmartReporting(String driverURL)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(driverURL);
driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/form/table/tbody/tr/td[3]/table/tbody/tr[1]/td[2]/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div/form/table/tbody/tr/td[3]/table/tbody/tr[1]/td[2]/div/input")).sendKeys("siadmin");
		driver.findElement(By.xpath("/html/body/div[1]/div/form/table/tbody/tr/td[3]/table/tbody/tr[1]/td[3]/div/input")).sendKeys("siadmin");
		driver.findElement(By.id("logonButton")).click();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	}
	*/
	public void testMethod()
	{
		System.out.println("This is test method");
	}
	

}