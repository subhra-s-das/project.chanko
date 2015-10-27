package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new CompareArrayList().compare();

	
	}
	public void compare()
	{
	String array1[]={"Apple","Banana","T"};
	String array2[]={"Apple","Banana","t"};
	
for (int i=0;i<array1.length;i++)
 {
	
	String a1 = array1[i];
			System.out.println(array1[i]);
			for (int j = i; j <= i; j++) {
String a2=array1[j];
				System.out.println(array2[j]);
				
				if(a1.equalsIgnoreCase(a2))
				{
					System.out.println("TRUE");
				}
			}
		}
	
	
 boolean checkEquals = Arrays.deepEquals(array1, array2);
//	boolean checkEquals=array1.equals(array2);
	

//System.out.println(checkEquals);
	}
}



