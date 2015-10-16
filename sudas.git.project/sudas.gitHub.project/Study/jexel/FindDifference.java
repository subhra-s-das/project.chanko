package jexel;

public class FindDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Outer {

	class Inner {
		String fruit1Name ;
		public void inner() {

			String fruits1[] = { "Apple", "Banana" };

			String fruits2[] = { "Apple", "Banana" };

			
			
			for (int i = 0; i < fruits1.length; i++) {
				fruit1Name= fruits1[i];
			}

			for (int i = 0; i < fruits2.length; i++) {
				String fruit2Name = fruits1[i];
			}

			System.out.println(fruit1Name.length());
		}
	}

}