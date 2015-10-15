package apache.commons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyDirectory {

	public static void main(String[] args) {
		new CopyDirectory().copyDirectory();
		new CopyDirectory().checkCopy();
	}

	public void copyDirectory() {
		File srcDir = new File("/Users/S_Das/Documents/Java/project.chanko");
		File destDir = new File("/Users/S_Das/Documents/Java/new.project.chanko");

		try {
			FileUtils.copyDirectory(srcDir, destDir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkCopy() {
		File file = new File("/Users/S_Das/Documents/Java/new.project.chanko");
		if (file.exists()) {
			System.out.println("Directory copied");

		}

		else {
			System.out.println("not");
		}
	}

}
