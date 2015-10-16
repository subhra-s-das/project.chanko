package sudas.study.example.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File01 {

	public static void main(String[] args) {
		CreateFile create = new CreateFile();
		create.create("C:\\Test\\");
create.readFile();
		DeleteFile delete = new DeleteFile();
		// delete.delete("C:\\Test\\New_File_01");

		
		
	}

}

// create a file and write to the file

class CreateFile {

String createPath;

	public void create(String createPath) {
		this.createPath=createPath;
		File f= new File(createPath + "New_File_01");

		try {
						if (f.createNewFile())

			{
				System.out.println("New File created");
			}

			else {
				System.out.println("File exists");
			}
						
						// take input from console to enter in file
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("Enter the content to be written");
						String s = br.readLine();
						
						
						FileOutputStream fos = new FileOutputStream(f);
						fos.write(s.getBytes());
						
						
						//read the content of file
						
						

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void readFile()
	{
	try {
		File f = new File(createPath+ "New_File_01");
		FileInputStream fis = new FileInputStream(f);
		int nextbyte =fis.read();
		while (nextbyte !=-1)
		{
			System.out.print((char)nextbyte);
		}
		fis.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}




// delete a file
class DeleteFile {
	public void delete(String deletePath) {

		if (new File(deletePath).delete()) {
			System.out.println("File Deleted");
		}

	}

}