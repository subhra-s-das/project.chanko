package Sandbox;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class CopyTextFile {

	String path = "C:/Test/";
	String destination = "C:/Test/logitech.log";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyTextFile file = new CopyTextFile();
		try {
			file.copyFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void copyFile() throws FileNotFoundException {
		File inputFile = new File(path + "/643.jpg");
		File outputFile = new File(path + "/6431.jpg");
		if (outputFile.exists()) {
			outputFile.delete();
		} else

		{
			try {
				outputFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile));
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
			int read;
			while ((read = bis.read()) != -1) {

				Character c = (char) read;
				// System.out.print(c);

				byte[] b = c.toString().getBytes();
				bos.write(b);
				System.out.println(b);

			}
			bos.flush();
			bos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
