package sudas.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new logScanner().scanIgnoreCase();
	}

}

class logScanner {
	String path = "C:/Test/line.txt";
	int lineNumber;

	public void scanIgnoreCase() {

		try {
			Scanner in = new Scanner(new FileInputStream(path));
			int lineNum = 0;
			while (in.hasNextLine()) {
				String nextline = in.nextLine();
//				System.out.println(nextline);
//				System.out.println(lineNum++);
if (nextline.equalsIgnoreCase("apple"))
{
	System.out.println(nextline+lineNum);
}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}