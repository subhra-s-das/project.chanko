package sudas.study.example.zero;

public class Example_03 {

	public static void main(String[] args) {
	
		String  [] books = {"Java","CSharp","Automation","Testing_QA"};
		int Dog [] = {1,2,3,4,5};
		
		int Book_ArrayLength = books.length;
		int Dog_ArrayLength = Dog.length;
		System.out.println(Book_ArrayLength);
		System.out.println(Dog_ArrayLength);
		int x = Dog [4];
		System.out.println("The value is " +x);
		
	int rand1 = (int) (Math.random() * Book_ArrayLength);	
	int rand2 = (int) (Math.random()*Dog_ArrayLength);
	
System.out.println(rand1);
String s1 = books [rand1];
int s2 = Dog [rand2];
System.out.println(s1 +" "+"test");
System.out.println("Random number is : " +s2);
	}

}
