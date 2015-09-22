package FileSystem;

import java.io.File;

public class RecursiveFileDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursive R = new Recursive();
		R.readRecursive("C:/Test");
	}
}
class Recursive {
	String path;
	public void readRecursive(String path) {
		File f = new File(path);
		File[] fileList = f.listFiles();
		if (fileList == null)
			return;
		// check the fileList
		for (int i = 0; i < fileList.length; i++) {
			 /*if fileList objec is directory
			 recurse through directories until the fileList
			 object returns null*/
			if (fileList[i].isDirectory()) {
				readRecursive(fileList[i].getAbsolutePath());
				System.out.println(fileList[i].getAbsoluteFile().getPath());
			}

			else if (fileList[i].isFile()) {
				System.out.println(fileList[i].getAbsoluteFile().getPath());
			}
		}
	}
}