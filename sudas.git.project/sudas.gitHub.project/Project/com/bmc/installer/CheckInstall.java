package com.bmc.installer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckInstall {
	public static void main(String arg[]) {

		Recursive recursivefile = new Recursive();
		recursivefile.scan("C:/Users/sudas/Yellowfin 7.1");

	}

}

class nonRecursive {

	// method
	public void scan(String path) {
		File filelist = new File(path);
		File[] listOfFile = filelist.listFiles();

		for (int i = 0; i < listOfFile.length; i++) {

			if (listOfFile[i].isDirectory()) {
				System.out.println("Directory " + listOfFile[i].getName());
			}

			else if (listOfFile[i].isFile()) {
				System.out.println("File " + listOfFile[i].getName());
			}
		}

	}

}

class Recursive {

	// method
	public void scan(String path) {
		File filelist = new File(path);
		File[] listOfFile = filelist.listFiles();

		SimpleDateFormat dateformat = new SimpleDateFormat(
				"dd/mm/yyyy hh:mm:ss");

		if (listOfFile == null)
			return;
		for (int i = 0; i < listOfFile.length; i++) {
			if (listOfFile[i].isDirectory()) {
				scan(listOfFile[i].getAbsolutePath());

				System.out.println("Directory Name "
						+ listOfFile[i].getAbsoluteFile());
				long time = listOfFile[i].lastModified() / 1000;
				System.out.println("Modified Date "
						+ new Date(time * 1000).toString());
			}

			else {
				System.out.println("File Name "
						+ listOfFile[i].getAbsoluteFile());
				long time = listOfFile[i].lastModified() / 1000;

				System.out.println("Modified Date "
						+ new Date(time * 1000).toString());
				double filesize = listOfFile[i].length();
				System.out.println("File Size in bytes " + filesize);

			}

		}

	}
}
