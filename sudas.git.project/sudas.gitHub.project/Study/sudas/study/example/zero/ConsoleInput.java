package sudas.study.example.zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console con = new Console();

			con.console1();
		

	}

}



class Console
{
	public void console1()
	{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s = reader.readLine();
			
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	
	}
	
	
	public void console2()
	{
		
		
	}
	
	
}