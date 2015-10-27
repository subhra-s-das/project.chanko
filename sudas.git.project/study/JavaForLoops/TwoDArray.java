package JavaForLoops;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new TwoDArray().twoDimArray();
	}

	public void twoDimArray()
	{							//rows					//columns
		String employees [][]={{"John","Peter","Dave"},{"J","P","D"}};
		
		
		for (int i=0;i<employees.length;i++)
		{
//			System.out.println(employees[i]);
			
			for (int j=0;j<employees[i].length;j++)
			{
				System.out.print(i);
				System.out.println(j);
				System.out.println(employees[i][j]);
			}
		}
		
	
		System.out.println("Number of rows "+employees.length);
		System.out.println("Number of cloumn in row 0 is "+employees[0].length);
		System.out.println("Number of cloumn in row 0 is "+employees[1].length);
		
	}
	
}
