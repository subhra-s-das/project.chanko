package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage extends ObjectRepo {

	public static void main(String[] args) {

		LoginPage login = new LoginPage();

	}
/**
 * Every method is taking WebDriver object as argument and returning WebElement interface.
 * @param driver
 * @return
 */
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
/***
 * to perform validation after login
 * @param driver
 * @return
 */
	public static WebElement VerificationImage(WebDriver driver) {
		WebElement imageElement = driver.findElement(By.cssSelector(getIMAPGE_VALIDATION_PATH()));
		return imageElement;
	}
}
