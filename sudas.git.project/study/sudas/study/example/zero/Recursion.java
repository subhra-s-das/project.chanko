package sudas.study.example.zero;

public class Recursion {

	public static void main(String[] args) {

Recur re = new Recur();
int result = re.forloop(0);


	}

}


class Recur	//replace for loop
{
	
	int number ;
	
	//recursion
	
	public int forloop(int number)
	{

if (number ==10)
	return 10;
		int result = number ++;
		System.out.println(number);
		forloop(number);

		return result;
		
		
		
	}
	
	

}