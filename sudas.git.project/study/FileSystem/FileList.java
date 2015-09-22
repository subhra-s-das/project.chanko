package FileSystem;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

public class FileList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindFileName().filter();

	}

}

class FindFileName {
	public void filter() {
		File f = new File("C:/Test");
		String fName = "Helloworld";
		String fileName = fName.toLowerCase();
		IOFileFilter fileFilter = FileFilterUtils.nameFileFilter(fileName);
		Collection<File> listOfFiles = FileUtils.listFiles(f, fileFilter, null);

		Iterator<File> fileIterator = listOfFiles.iterator();
		while (fileIterator.hasNext()) {
			System.out.println(fileIterator.next().getName());

		}
	}
}
