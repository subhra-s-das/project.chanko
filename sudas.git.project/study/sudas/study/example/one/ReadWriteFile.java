package sudas.study.example.one;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class ReadWriteFile {

	public static void main(String[] args) {



	}

}

// read file using file input stream
class ReadFile1 {
	String path;

	public void read(String path) {
		this.path = path;
		File f = new File(path);

		try {
			FileInputStream input = new FileInputStream(f);
			int content;
			while ((content = input.read()) != -1) {
				System.out.print((char) content); // type casting int to
													// character
			}
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

// read file using Buffered input stream

class ReadFile {
	String contents;

	public String read(String path) {

		File f = new File(path);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			BufferedWriter writer = null;
			writer = new BufferedWriter(new FileWriter("c:/Test/sudas.txt"));
			while ((contents = reader.readLine()) != null) {

				writer.write(contents);
				writer.write('\n');

				// System.out.println(contents);

			}
			reader.close();
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contents;

	}

	public String read1(String path) {

		File f = new File(path);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream("c:/Test/Output.txt"));
			while ((contents = reader.readLine()) != null) {
				out.write(contents.getBytes());
				out.write("\n".getBytes());
		
				System.out.println(contents);

			}
			reader.close();
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contents;

	}

}

class CreateFiles {
	public void create(String path) {
		File f = new File(path);
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
