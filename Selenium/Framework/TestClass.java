package Framework;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass extends WebElementProperties {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get(getURL());
		LoginPage.userName(driver).clear();
		LoginPage.userName(driver).sendKeys(getS_USR_NAME());
		LoginPage.password(driver).clear();
		LoginPage.password(driver).sendKeys(getS_PASSWD());
		LoginPage.LoginButton(driver).click();
		Reports.browse(driver).click();
		//*[@id="rptListTbl"]/tbody
		WebElement table = driver.findElement(By.xpath("//*[@id='rptListTbl']/tbody"));
		List<WebElement> tr = table.findElements(By.tagName("tr"));
	for (int i=0;i<tr.size();i++)
	{
		System.out.println(tr.get(i).getText());
		List<WebElement> td = tr.get(i).findElements(By.tagName("td"));
		for (int j=0;j<td.size();j++)
		{
			List<WebElement> td1 = td.get(j).findElements(By.tagName("a"));
			for(int k=0;k<td1.size();k++)
			{
				System.out.println(td1.get(k).getText());
				
			}
//			System.out.println(td.get(j).getText());
			
		}
	}
		
driver.close();
	}

}
