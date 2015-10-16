package sudas.study.example.zero;

import java.io.File;
import java.io.FilenameFilter;



public class FilePattern {
	public static void main(String args[]) {
		
File file = new File("C:\\Test");


FilenameFilter filter = new FilenameFilter() {
	
	@Override
	public boolean accept(File dir, String name) {
		if (name.toLowerCase().endsWith(".txt"))
		{
			return true;
		}
		else
		{		
		return false;
		}
	}
};

//http://www.avajava.com/tutorials/lessons/how-do-i-get-all-files-with-certain-extensions-in-a-directory-including-subdirectories.html

File[] listfilterFile = file.listFiles(filter);
		

	for (int i=0;i<listfilterFile.length;i++)
	{
		if(listfilterFile[i].isDirectory())
		{
//			file.list(filter);
			System.out.println(listfilterFile[i].getName());
		}
		else if (listfilterFile[i].isFile())
		{
			System.out.println(listfilterFile[i].getAbsoluteFile());
		}
			
	}
		
	}

}
