package Sandbox;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ScannerClass().fileReader();
	}

	public void scan()
	{
		Scanner scan = new Scanner(System.in);
		scan.hasNext();
		{
			String line=scan.nextLine();
			System.out.println(line);
		}
		
		List<String> list = new ArrayList<String>();
		
	}
	
	public void fileReader()
	{
		BufferedInputStream bis;
		try {
			bis = new BufferedInputStream(new FileInputStream(new File("C:/Test/log_list.txt")));
		
			int line;
			while((line=bis.read())!=-1)
			{
				char c = (char)line;
				System.out.print(c);
				
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
	
	}
	
}
