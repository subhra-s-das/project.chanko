package FileSystem;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class FileHelper {

	public static void main(String[] args) {
//class FileFilter
		FileFilter fil = new FileFilter();
		fil.filter();
		

	}

}

/*
 *Logic 
 *Step 1: Read directories and sub directories and list file as per file extension
 *Step 2: Create a new file
 *Step 3: Write the output of Step:1 into a file 
 */

//Step 1: Read directories and sub directories and list file as per file extension
class FileFilter
{
	String pathname="C:\\Test";
	public void filter()
	{
		// array of file extensions
		String fileExtn[]={"txt","java"};
		File f = new File(pathname);
		new FileUtils();
		Collection<File> filterList = FileUtils.listFiles(f, fileExtn, true);
		
		Object[] array = filterList.toArray();
		int i;
		for (i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	// *Step 2: Create a new file
	public void createFile()
	{
		
	}
	
}