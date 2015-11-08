package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepo {

	private static String URL;
	private static String USER_NAME;
	private static String PASSWORD;
	private static String LOGIN_BUTTON_PATH;
	private static String IMAGE_VALIDATION_PATH;
	private static String S_USR_NAME;
	private static String S_PASSWD;
	private static String NAVIGATE_BROWSE;
	private static String REPORT_TABLE;

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
		URL = new ObjectRepo().properties().getProperty("url");
		return URL;
	}

	public static String getUSER_NAME() {
		USER_NAME = new ObjectRepo().properties().getProperty("username");
		return USER_NAME;
	}

	public static String getPASSWORD() {
		PASSWORD = new ObjectRepo().properties().getProperty("password");
		return PASSWORD;
	}

	public static String getLOGIN_BUTTON_PATH() {
		LOGIN_BUTTON_PATH = new ObjectRepo().properties().getProperty("loginButton");
		return LOGIN_BUTTON_PATH;
	}

	public static String getIMAPGE_VALIDATION_PATH() {
		IMAGE_VALIDATION_PATH = new ObjectRepo().properties().getProperty("validationImage");
		return IMAGE_VALIDATION_PATH;
	}

	public static String getS_USR_NAME() {
		S_USR_NAME = new ObjectRepo().properties().getProperty("sendUserName");
		return S_USR_NAME;
	}

	public static String getS_PASSWD() {
		S_PASSWD = new ObjectRepo().properties().getProperty("sendPassword");
		return S_PASSWD;
	}

	public static String getNAVIGATE_BROWSE() {
		NAVIGATE_BROWSE = new ObjectRepo().properties().getProperty("browseTAB");
		return NAVIGATE_BROWSE;
	}

	public static String getREPORT_TABLE() {
		REPORT_TABLE = new ObjectRepo().properties().getProperty("JSTable");
		return REPORT_TABLE;
	}

}
