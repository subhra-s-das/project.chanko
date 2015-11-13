package TablesExamples;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadTable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new YellowFin().scanTable();

	}

}

class YellowFin {
	public void scanTable() {
		WebDriver driver = new FirefoxDriver();
		// driver.get("file:///Users/S_Das/Desktop/html_table.html");
		driver.navigate().to("http://localhost:8080/");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("admin@yellowfin.com.au");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.id("logonButton")).click();
		//
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("javascript:on_submit('MIREPORT');");
		driver.findElement(By.xpath("//*[@id='MIBrowseAnchor']/a")).click();
		WebElement tbody = driver.findElement(By.xpath("//*[@id='rptListTbl']/tbody"));
		List<WebElement> tr = tbody.findElements(By.tagName("tr"));
		System.out.println(tr.size());
		Iterator<WebElement> it1 = tr.iterator();
		while (it1.hasNext()) {
			List<WebElement> td = it1.next().findElements(By.tagName("a"));
			Iterator<WebElement> it2 = td.iterator();
			while (it2.hasNext()) {
				System.out.println(it2.next().getText());

			}
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}
}
