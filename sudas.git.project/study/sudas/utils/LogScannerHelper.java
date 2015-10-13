package sudas.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LogScannerHelper {

	public static void main(String[] args) {
		// new Bufferedreader().inputStream();

		new scanner().scanLines();
	}

}

class scanner {

	// read the content of the log file and search for a perticular string
	public void scanLines() {
		try {
			Scanner scan = new Scanner(new File("C:\\Java_Source_Code\\New folder\\New folder\\sudas.git.project\\study\\sudas\\utils\\sample.txt"));

			String match = "of";
			int lineNumber = 1;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();

				// System.out.println(line+'\t'+lineNumber++);

				Scanner string = new Scanner(line);

				String completeString = string.findInLine("Com0113:");

				{
					int lineNum = lineNumber++;
					if (completeString != null) {

						System.out.println(completeString + '\t' + "-- at line number "+lineNum);
					}
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}