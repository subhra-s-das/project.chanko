package FileSystem;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {

		// bufferreader b = new bufferreader();
		// b.buffreader();

//		CopyContent C = new CopyContent();
//		C.copy();

//		Bufferinput buff = new Bufferinput();
//		buff.buffinput();
		
		BufferOutput bfo = new BufferOutput();
		bfo.bufferout();
	
	}
	

}

/*
 * character byte Reader Input Stream File Reader File input stream File Writer
 * File output stream Buffer Reader Buffer input stream Buffer Writer Buffer
 * output stream
 */
// Example for Buffer Reader class from character class
class bufferreader {

	public void buffreader() {
		try {
			BufferedReader breader = new BufferedReader(new java.io.FileReader(
					new File("C:/Test/sudas.txt")));
			while (breader.readLine() != null) {
				System.out.println(breader.readLine());
			}
			breader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class buffWriter {
	public void writer() {
		String path = "C:/Test/CreateFile.txt";
		// create a file
		File file = new File(path);
		try {
			if (file.exists()) {
				file.deleteOnExit();
				System.out.println("file exists deleting file");

			}

			else {
				file.createNewFile();
			}

			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			writer.write("This is for Test Purpose");

			writer.flush();
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

// Utility to copy the content of one file to the other

class CopyContent {
	public void copy() {
		String sourceFile = "C:/Test/AdobeARM.log";
		String destinationFile = "C:/Test/CreateFile.txt";
		try {

			// create a file
			File file = new File(destinationFile);
			if (file.exists()) {
				file.deleteOnExit();
				System.out.println("file exists deleting file");
			} else {
				file.createNewFile();

				System.out.println("File created");
			}

			// Read the source file content
			BufferedReader breader = new BufferedReader(new java.io.FileReader(
					new File(sourceFile)));
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					destinationFile));
			while (breader.readLine() != null) {
				char[] readLine = breader.readLine().toCharArray();
				// write
				writer.write(readLine);
				writer.write('\n');
			}
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

// use of Bufferinput stream
// use of bufferoutput stream

class Bufferinput
{
	
	public void buffinput()
	{
		String path="C:/Test/CreateFile.txt";
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
			int data = bis.read();
			while (bis.available()>0)
			{
				int readData = bis.read();
				System.out.print((char)readData);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class BufferOutput
{
	public void bufferout()
	{
		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/Test/File1.txt"));
			String sample="This is a sample text";
			byte[] inbyte = sample.getBytes();
			
			bos.write(inbyte);
			
			bos.flush();
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



