package jsoup;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class Usejsoup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection connection = Jsoup.connect("http://localhost:8080/");
		try {
			Elements tagInput = connection.get().getElementsByTag("imput");
			System.out.println(tagInput.html());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
