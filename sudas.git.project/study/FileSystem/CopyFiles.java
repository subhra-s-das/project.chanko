package FileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CopyFiles().copyFiles();

	}

	public void copyFiles() {
		String destination = "/Users/S_Das/Documents/Java/new.xml";
		String source = "/Users/S_Das/Documents/Java/jdk-8u60-linux-i586.gz";

		try {
			// OPTION 01
			Files.copy(Paths.get("/Users/S_Das/Documents/Java/pom.xml"), new FileOutputStream(new File(destination)));

			// OPTION 02
			Files.copy(new FileInputStream(new File(source)),
					Paths.get("/Users/S_Das/Documents/Java/NEW_jdk-8u60-linux-i586.gz"),
					StandardCopyOption.REPLACE_EXISTING);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
