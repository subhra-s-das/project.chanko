package StringHelper;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

import org.apache.commons.lang3.StringUtils;

public class StringHelper02 {

	public static void main(String[] args) {

		logScanner logscan = new logScanner();
		logscan.scanIgnoreCase();
		new ReadLine().lineNum();

	}

}

class useOfStringBuilder {
	public void scan() {
		// fileinputstream to string
		StringBuilder sb = new StringBuilder();
		try {
			FileInputStream fis = new FileInputStream(new File("/Users/S_Das/Documents/Java/sudas.log"));
			int input;
			while ((input = fis.read()) != -1) {
				sb.append((char) input);
			}
			System.out.println(sb.toString());
			fis.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class logScanner {
	public void scanIgnoreCase() {
		StringBuilder sb = new StringBuilder();
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("/Users/S_Das/Documents/Java/sudas.log"));

			int input;
			while ((input = fis.read()) != -1) {
				sb.append((char) input);
			}

			String findword[] = { "apache", "log" };

			for (int i = 0; i < findword.length; i++) {
				// System.out.println(findword[i]);

				if (StringUtils.containsIgnoreCase(sb.toString(), findword[i])) {
					System.out.println("contains " + findword[i]);
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class ReadLine
{
	public void lineNum()
	{
	try {
		LineNumberReader ln = new LineNumberReader(new FileReader(new File("/Users/S_Das/Documents/Java/sudas.log")));
		try {
			String s;
			while ((s=ln.readLine())!=null);
			System.out.println(ln.getLineNumber());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	scanner
	
	
	
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
