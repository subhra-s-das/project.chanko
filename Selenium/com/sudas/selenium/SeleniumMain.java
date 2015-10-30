package com.sudas.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SeleniumMain {
	static String URL;

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new SeleniumMain().createProperties();
//		new testClass().test();
	}

	public void createProperties() {

		try {
			File file = new File("/Users/S_Das/selenium.properties");
			if (file.exists()) {
				file.delete();
			} else {
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file);

			Properties property = new Properties();
			property.setProperty("URL", "http://localhost:9090/WebProject/WebTable.html");
			// property.setProperty("test", "Hello'\'://World");

			property.store(writer, "Selenium Properties File");

			property.load(new FileInputStream(file));
			String url = property.getProperty("URL");
			SeleniumMain.URL = url;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
