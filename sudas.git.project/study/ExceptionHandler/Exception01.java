package ExceptionHandler;


public class Exception01 {

	String name;
	public static void main(String[] args) {
			
		try {
			new Exception01().diplayname("Subhra S Das");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getCause();
		}
	}

	public void diplayname(String name) throws Exception
	{
		this.name=name;
		System.out.println(name);
		if(name.length()>4)
		{
			System.out.println("length exceeded");
		}
		
		
	}
	
	 
}
