package Framework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import sudas.study.example.zero.Sleep;

public class CreateListOfReports extends WebElementProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		File file = new File("/Users/S_Das/js.properties");
		if (file.exists()) {
			file.delete();
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileWriter writer = new FileWriter(file);

		driver.get(getURL());
		LoginPage.userName(driver).clear();
		LoginPage.userName(driver).sendKeys(getS_USR_NAME());
		LoginPage.password(driver).clear();
		LoginPage.password(driver).sendKeys(getS_PASSWD());
		LoginPage.LoginButton(driver).click();
		Reports.browse(driver).click();

		List<String> JSlist = Reports.getReportsJS(driver);
//		Iterator<String> jsit = JSlist.iterator();
//		while (jsit.hasNext()) {
//			System.out.println(jsit.next().toString());
//		writer.write("hello there".toString());
//		}
		for (int i=6;i<JSlist.size();i++)
		{
			writer.write("report "+i+"="+JSlist.get(i).toString());
			writer.write('\n');
		}
		
		writer.flush();
		writer.close();
	}

}
