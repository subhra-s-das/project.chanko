package Scanner;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScannerHelper {
	String line;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new ScannerHelper().scanner();
	}

	public void scanner() throws IOException {
		Scanner scan = new Scanner(System.in);

		File f = new File("C:/Test/createdbyscanner.txt");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
		if (f.exists()) {
			f.delete();
		}

		boolean condition = true;

		ArrayList<String> arraylist = new ArrayList<String>();
		while (condition) {
			line = scan.nextLine();
			arraylist.add(line);
			if (line.equals(".")) {
				break;
			}
		}

		Iterator<String> itr = arraylist.iterator();
		while (itr.hasNext()) {
			String scannerLine = itr.next().toString();
			// System.out.println(scannerLine);

			try {

				System.out.println("from scanner " + scannerLine);
				bos.write(scannerLine.getBytes());
				bos.write(' ');
				bos.write('\n');

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		bos.flush();
		bos.close();

	}
}
