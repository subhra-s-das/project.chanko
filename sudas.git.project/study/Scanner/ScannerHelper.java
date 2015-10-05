package Scanner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ScannerHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class FindLineNumbers
{
	public void find()
	{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
	try {
		String line = reader.readLine();
		
		System.out.println(line);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}