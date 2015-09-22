package sudas.study.example.zero;

class  Sum {
	 
	 int x;
	 int y;
	 
//constructor
	 
	 public Sum(int value1, int value2) {
		 x= value1;
		 y=value2;
//		 System.out.println(x);
	}
	 
//		static	 void Setsum (int value1, int value2)
//
//	 {
//		 x= value1;
//		 y=value2;
//		 System.out.println(x);
//	 }

int getSum()
	 {
		 return x+y;
	 }
 }

//public class JavaBasics {
//	
//	public static void main(String[] args) {
//		
//		Sum newSum = new Sum();
//		newSum.Setsum(10, 10); // 10 , 10 are the arguments
//				//OR
//new Sum().Setsum(10, 10);
//
//		
//		
//		System.out.println(new Sum().getSum());
//		
//				//OR
//		System.out.println(newSum.getSum());
//		
//		
//		
//	}
//
//}

class Add
{
int a,b;

//set method 

void addSum (int i, int j)
{
	a=i;
	b=j;
}

//get method

	
}

/****************************************************************************************************
 * 
 * Main method
 * 
 * 
 *****************************************************************************************************/
public class JavaBasics
{
	public static void main(String[] args)
	{
		
		Sum sum = new Sum(10, 10);
//		sum.x=10;
//		sum.y=10;
//	Sum.Setsum(10, 10);
int totalSum=sum.getSum();
System.out.println(totalSum);

Sum sum1 = new Sum(100, 10);

//sum1.x=10;
//sum1.y=10;
//Sum.Setsum(10, 10);
int totalSum1=sum1.getSum();
System.out.println(totalSum1);
	}
	}


