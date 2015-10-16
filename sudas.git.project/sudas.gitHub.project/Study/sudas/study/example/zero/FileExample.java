package sudas.study.example.zero;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		listOfFiles filelist = new listOfFiles();
		filelist.filelist("C:\\Oracle_JDBC");

		// filter

	}

}

class listOfFiles {
	// method
	public void filelist(String Path) {
		File listoffiles = new File(Path);
		File[] fileList = listoffiles.listFiles();

		if (fileList == null)
			return;
		System.out.println("file list null");
		for (int i = 0; i < fileList.length; i++) {

			if (fileList[i].isDirectory()) {
				filelist(fileList[i].getAbsolutePath());
				System.out.println("Directory " + fileList[i].getAbsoluteFile()
						+ '\t' + '\n' + "PARENT " + fileList[i].getParent());
			}

			else if (fileList[i].isFile()) {
				System.out.println("File " + fileList[i].getAbsoluteFile());
			}
		}
	}

}
