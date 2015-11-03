package Framework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reports extends WebElementProperties {

	public static WebElement browse(WebDriver driver) {
		WebElement browseElement = driver.findElement(By.cssSelector(getNAVIGATE_BROWSE()));
		return browseElement;
	}

	public static List<String> getReportsJS(WebDriver driver) {
		List<String> arraylist = new ArrayList<String>();
		WebElement table = driver.findElement(By.xpath(Reports.getREPORT_TABLE()));
		List<WebElement> td = table.findElements(By.tagName("td"));
		for (int i = 0; i < td.size(); i++) {
			List<WebElement> a = td.get(i).findElements(By.tagName("a"));
			for (int j = 0; j < a.size(); j++) {
				String javascripts = a.get(j).getAttribute("href");
				arraylist.add(javascripts);
//				System.out.println(javascripts);
			}
		}
		return arraylist;

	}

}
