package sudas.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new logScanner().findKeyWord();
	}

}

class logScanner {
	String path = "C:/Test/line.txt";
	int lineNumber;

	public void findKeyWord() {

		try {
			Scanner in = new Scanner(new FileInputStream(path));
			int lineNum = 0;
			// while (in.hasNextLine())
			while (in.hasNext()) {
				String nextline = in.nextLine();
				// System.out.println(nextline);
				int number = lineNum++;

				Scanner s = new Scanner(nextline);
				{
					String nextS = s.next();
					if (nextS.equalsIgnoreCase("Hello")) {
						System.out.println("Contains the word " + nextline + " at line number " + number);
					}
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void findLine() {
		
	

	}

}