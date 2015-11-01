package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WebElementProperties {

	private static String URL;
	private static String USER_NAME;
	private static String PASSWORD;
	private static String LOGIN_BUTTON_PATH;
	private static String IMAGE_VALIDATION_PATH;
	private static String S_USR_NAME;
	private static String S_PASSWD;
	private static String NAVIGATE_BROWSE;

	public Properties properties() {
		File file = new File("/Users/S_Das/csspath.properties");
		Properties property = new Properties();
		try {
			property.load(new FileInputStream(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property;

	}

	public static String getURL() {
		URL = new WebElementProperties().properties().getProperty("url");
		return URL;
	}

	public static String getUSER_NAME() {
		USER_NAME = new WebElementProperties().properties().getProperty("username");
		return USER_NAME;
	}

	public static String getPASSWORD() {
		PASSWORD = new WebElementProperties().properties().getProperty("password");
		return PASSWORD;
	}

	public static String getLOGIN_BUTTON_PATH() {
		LOGIN_BUTTON_PATH = new WebElementProperties().properties().getProperty("loginButton");
		return LOGIN_BUTTON_PATH;
	}

	public static String getIMAPGE_VALIDATION_PATH() {
		IMAGE_VALIDATION_PATH = new WebElementProperties().properties().getProperty("validationImage");
		return IMAGE_VALIDATION_PATH;
	}

	public static String getS_USR_NAME() {
		S_USR_NAME = new WebElementProperties().properties().getProperty("sendUserName");
		return S_USR_NAME;
	}

	public static String getS_PASSWD() {
		S_PASSWD = new WebElementProperties().properties().getProperty("sendPassword");
		return S_PASSWD;
	}

	public static String getNAVIGATE_BROWSE() {
		NAVIGATE_BROWSE = new WebElementProperties().properties().getProperty("browseTAB");
		return NAVIGATE_BROWSE;
	}

}
