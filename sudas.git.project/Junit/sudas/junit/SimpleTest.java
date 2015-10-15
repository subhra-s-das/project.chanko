package sudas.junit;

import org.junit.Test;
import org.junit.Assert;
public class SimpleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new UnderTest().testMethod();
	}

}


class UnderTest
{

	// assertion test
	@Test
	public void testMethod()
	{
		String expected[]={"Apple","Banana"};
		String actual[]={"Apple","Banana"};
		
		String expected1="Apple";
		String actual1="Apple";
		
		byte[] exp1 = expected1.getBytes();
		byte[] act1 = actual1.getBytes();	
Assert.assertArrayEquals(exp1, act1);
	
	}
	
}