package sudas.study.example.one;

import sudas.study.example.one.MyInteface.myInterface;

public class MyInteface {

	public static void main(String[] args) {



	}
	public interface myInterface {
		
		String displayname(String name);
		String displayaddress(String address);
		int displayage(int age);
		 default void testMethod()
		{
			
		}

	}
}

class testInteface implements myInterface
{

	@Override
	public String displayname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayaddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int displayage(int age) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}




