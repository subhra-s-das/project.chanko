package sudas.study.example.zero;

public class InnerOuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



class Outer1
{
	String name;
	String address;
	
	// outer class method
	public void outer()
	{
		System.out.println("this is outer");
	}
	
	public void accessInner()
	{
		Inner inner = new Inner();
		String test = inner.innerName;
		System.out.println(test);
	 inner.inner();
		
	}
	
	
	class Inner
	{
		String innerName;
		
		// Inner class method
		public void inner()
		{
			System.out.println("this is inner");
		}
		
		
	}
	
	
	
}