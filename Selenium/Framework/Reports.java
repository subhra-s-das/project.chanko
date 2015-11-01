package Framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reports extends WebElementProperties {

	public static void main(String[] args) {

	}

	public static WebElement browse(WebDriver driver) {
		WebElement browseElement = driver.findElement(By.cssSelector(getNAVIGATE_BROWSE()));
		return browseElement;
	}

}
