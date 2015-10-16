package sudas.study.example.one;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OuterInner {

	public static void main(String[] args) {
		// create an object of outer class
		Outer outer = new Outer();
		
		//create an object of Inner class
		Outer.Inner inner = outer.new Inner();
		String test = inner.read("C:/Test/installTuner.log");

		
		InnerTest t = new InnerTest();
		t.read("C:/Test/installTuner.log");
	}

}

// -----------------------------------------------------------------------------------

class Outer {
	String path;
	String content;

	class Inner{
		String contents;
		
	public String read(String path) {
		Outer.this.path = path;	// access outer class variable
		File f = new File(path);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			content=contents;
			while ((contents = reader.readLine()) != null) {
//				System.out.println(contents);

			}
			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;

	}
}
}

class InnerTest{
	String contents;
	
public String read(String path) {
	
	File f = new File(path);
	try {
		BufferedReader reader = new BufferedReader(new FileReader(f));
	
		while ((contents = reader.readLine()) != null) {
			System.out.println(contents);

		}
		reader.close();

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return contents;

}
}