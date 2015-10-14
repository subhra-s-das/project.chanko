package junit;

import org.junit.Test;
import org.junit.Assert;

public class JunitTest {

	public static void main(String[] args) {

		new JunitTest().add();

	}

	@Test
	public void add() {
		int a = 10;
		int b = 10;
		int total = a + b;
//		System.out.println(total);

		int expected[] = { 20, 10, 33 };
		int actual[] = { 20, 10, 30 };

		for (int i=0;i<expected.length;i++)
		{
			System.out.println(expected[i]);
			continue;
		}
		
		Assert.assertArrayEquals(expected, actual);	
	}

}
