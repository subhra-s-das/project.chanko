package LineReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class GetLineNumber {

	public static void main(String[] args) {
		new GetLineNumber().getLineNumber();

	}

	public void getLineNumber() {
		try {
			LineNumberReader linereader = new LineNumberReader(new FileReader("C:/Test/line.txt"));

			int reader;
			while ((reader = linereader.read()) != -1) {
				// String contents =linereader.readLine();
				// System.out.println(contents);
				char c = (char) reader;
				System.out.print(c);

				if (c == '\n') {
					System.out.println(linereader.getLineNumber());
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
