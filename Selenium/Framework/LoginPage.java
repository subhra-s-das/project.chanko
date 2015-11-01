package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage extends WebElementProperties {

	public static void main(String[] args) {

		LoginPage login = new LoginPage();
		login.login();

	}

	public String login() {

		WebDriver driver = new FirefoxDriver();
		driver.get(getURL());
		driver.findElement(By.cssSelector(getUSER_NAME())).clear();
		driver.findElement(By.cssSelector(getUSER_NAME())).sendKeys(getS_USR_NAME());
		driver.findElement(By.cssSelector(getPASSWORD())).clear();
		driver.findElement(By.cssSelector(getPASSWORD())).sendKeys(getS_PASSWD());
		driver.findElement(By.cssSelector(getLOGIN_BUTTON_PATH())).click();
		String element = driver.findElement(By.cssSelector(getIMAPGE_VALIDATION_PATH())).getAttribute("src");
		return element;
	}

	public static WebElement userName(WebDriver driver) {
		WebElement UserElement = driver.findElement(By.cssSelector(getUSER_NAME()));
		return UserElement;

	}

	public static WebElement password(WebDriver driver) {
		WebElement PasswordElement = driver.findElement(By.cssSelector(getPASSWORD()));
		return PasswordElement;
	}

	public static WebElement LoginButton(WebDriver driver) {
		WebElement loginButtonElement = driver.findElement(By.cssSelector(getLOGIN_BUTTON_PATH()));
		return loginButtonElement;
	}

	public static WebElement VerificationImage(WebDriver driver) {
		WebElement imageElement = driver.findElement(By.cssSelector(getIMAPGE_VALIDATION_PATH()));
		return imageElement;
	}
}
