package FileSystem;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;


import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;

public class FileFilterApache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Filter f = new Filter();
		f.fileFilter("C:/Test");

	}

}

class Filter {
	String path;

	public void fileFilter(String path) {
		this.path = path;
		File f = new File(path);
		new FileUtils();
		String extn[] = { "txt", "java" };
		Collection<File> test = FileUtils.listFiles(f, extn, true);
		Iterator<File> iterate = test.iterator();

		File f2 = new File(path + "/Output.txt");
		try {
			if (f2.createNewFile()) {
				// System.out.println("File Created");

			}

			else {
				System.out.println("File Exists");
			}

			while (iterate.hasNext()) {
				File nxtElement = iterate.next();
				String absolutePath = nxtElement.getAbsolutePath();

				// String to byte[] conversion
				byte[] inbyte = absolutePath.getBytes();

				System.out.println(absolutePath);

				FileOutputStream fos = new FileOutputStream(f2);
				fos.write(inbyte);

				fos.close();

			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void writeOutput(String path) {

	}
}