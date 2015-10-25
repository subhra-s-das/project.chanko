package JavaSystemClass;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Systems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input = System.in;
		Scanner s = new Scanner(input);
		while(s.hasNext())
		{
			System.out.println(s.nextLine());
			break;
		}
	}

}
