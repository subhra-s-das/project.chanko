package sudas.study.example.zero;

public class EnumClass {

	public static void main(String[] args) {
	
		EnumDays theday = EnumDays.MONDAY;
		
		System.out.println(theday);

		EnumDays[] enumlist = EnumDays.values();
		
		for( int i=0;i<enumlist.length;i++)
		{
			System.out.println(enumlist[i].name());
		}
		
		//*************** SWITCH*****************
		EnumSwitch enumswitch = new EnumSwitch(theday);
		enumswitch.display();
		
	}

}

class EnumSwitch
{
	EnumDays e;
	public EnumSwitch(EnumDays e)
	{
		this.e=e;
	}
	
	public void display()
	{
		switch (e)
		{
		case MONDAY:
			System.out.println("This is MONDAY");
			break;
			
		}
	}
	
	
	
}

