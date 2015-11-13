package TablesExamples;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReadNestedTable().nestedTable();

	}

}

class ReadNestedTable
{
	public void nestedTable()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Users/S_Das/Desktop/Selenium.html");
		WebElement tbody = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody"));
		List<WebElement> tr = tbody.findElements(By.tagName("tr"));
		Iterator<WebElement> it1 = tr.iterator();
		while(it1.hasNext())
		{
			List<WebElement> td = it1.next().findElements(By.tagName("td"));
			Iterator<WebElement> it2 = td.iterator();
			while(it2.hasNext())
			{
				String text = it2.next().getText();
				System.out.println(text);
			}
			
		}
	}
	
}
