package sudas.study.example.zero;

public class Recursive {

	public static void main(String[] args) {

TestRecussive recursive = new TestRecussive();
recursive.forLoop(10);
increment inc = new increment();
inc.increase(0);

	}

}


class TestRecussive
{
	//method
	public void forLoop(int i)
	{
		for (i=0;i<=10;i++)
		{
			System.out.println(i);
	
		}
		System.out.println("");
	}
	
	
	
}

class increment
{
	//method
	public void increase(int i)
	{
	
	
		System.out.println(i);
		if (i==10)
			return;
		increase(i+1);

	}
}
