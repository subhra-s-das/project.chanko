package sudas.study.example.zero;

import java.lang.reflect.Method;

public class GetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UnderTest undertest = new UnderTest();
System.out.println(undertest);

undertest.underTest();


	}

}

class UnderTest
{
	public void underTest()
	{
		System.out.println(this);
		
		Class<? extends UnderTest> currentClass = this.getClass();
		try {
			Method currentMethod = currentClass.getMethod("underTest", null);
			System.out.println(currentMethod);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String currentClassPath = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
	System.out.println(currentClassPath);
	}
	
}
