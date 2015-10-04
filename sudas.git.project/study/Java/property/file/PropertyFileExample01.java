package Java.property.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyFileExample01 {

	public static void main(String[] args) {
		new PropertyFileExample01().setProperties();
		new PropertyFileExample01().getProperies();
		new PropertyFileExample01().readAllFromProperties();
	}

	// write to the properties file
	public void setProperties() {
		/*
		 * and if you want to create the file sudas.properties file.CreateFile
		 * something to do
		 */
		File file = new File("/Users/S_Das/git/project.chanko/sudas.properties");

		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));

			Properties prop = new Properties();
			prop.setProperty("hostname", "testHostName");
			prop.setProperty("username", "testUserName");
			prop.setProperty("password", "testPassword");

			/*
			 * writes the property table to the Output stream Parameters: out an
			 * output stream. comments a description of the property list.
			 */
			prop.store(bos, null);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// read from the properties file
	public void getProperies() {

		// created a file input stream to read the properties file
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(new File("/Users/S_Das/git/project.chanko/sudas.properties")));

			Properties prop = new Properties();
			// Reads a property list (key and element pairs) from the input byte
			// stream.
			prop.load(bis);
			// get the properties file
			String hostname = prop.getProperty("hostname");
			String usernsme = prop.getProperty("username");
			String password = prop.getProperty("password");

			System.out.println(hostname + '\t' + usernsme + '\t' + password);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// This method is not working not able to find the file from class path
	/*
	 * public void getPropertiesFromClassPath() {
	 * 
	 * InputStream inputStream =
	 * PropertyFileExample01.class.getClassLoader().getResourceAsStream(
	 * "/sudas.properties");
	 * 
	 * try { Properties prop = new Properties(); prop.load(inputStream);
	 * 
	 * String hostname = prop.getProperty("hostname"); String usernsme =
	 * prop.getProperty("username"); String password =
	 * prop.getProperty("password");
	 * 
	 * System.out.println(hostname + '\t' + usernsme + '\t' + password);
	 * 
	 * } catch (IOException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

	// read everything from a property file
	public void readAllFromProperties() {
		Properties prop = new Properties();
		BufferedInputStream bis;
		try {
			bis = new BufferedInputStream(
					new FileInputStream(new File("/Users/S_Das/git/project.chanko/sudas.properties")));
			prop.load(bis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Enumeration<?> values = prop.propertyNames();

		while (values.hasMoreElements()) {
			String key = values.nextElement().toString();
			System.out.println("Key : " + key);
			String value = prop.getProperty(key);
			System.out.println("Value : " + value);
		}
	}

}
