package com.sudas.selenium;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingWebTable {
	BufferedOutputStream bos;
	File file;
	String in;
	String out;

	public static void main(String[] args) {
		new ReadingWebTable().ReadTable1();

	}

	@Test
	public void ReadTable1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://webdatacommons.org/webtables/");
		WebElement tableElement = driver.findElement(By.xpath("//*[@id='toccontent']/table[2]/tbody"));
		List<WebElement> td = tableElement.findElements(By.tagName("td"));

		Iterator<WebElement> it1 = td.iterator();
		try {
			file = new File("/Users/S_Das/selenium.txt");
			if (file.exists()) {
				file.delete();

			} else {
				file.createNewFile();
			}

			bos = new BufferedOutputStream(new FileOutputStream(file));

			while (it1.hasNext()) {
				// System.out.println();
				in = it1.next().getText();
//				 bos.write(it1.next().getText().getBytes());
//				 bos.write('\n');
				System.out.println(in);
				
			}

			bos.flush();
			bos.close();
			driver.close();

			try {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("/Users/S_Das/selenium copy.txt")));
				try {

					while ((bis.available()) > 0) {
						int read = bis.read();
						Character Cout = (char) read;
						String out = Cout.toString();
//						System.out.println(out);
					}
			

					Assert.assertEquals(in, out);

					bis.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
