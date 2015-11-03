package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FruitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new FruitsList().fruitslist();
	}

}

class FruitList {
	String name;
	String colour;

	// getters and setters methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}

class FruitsList {

	public void fruitslist() {
		// create some fruits
		FruitList f1 = new FruitList();
		f1.setName("xucini");
		f1.setColour("unknown");
		FruitList f2 = new FruitList();
		f2.setName("Grapes");
		FruitList f3 = new FruitList();
		f3.setName("apple");
		FruitList f4 = new FruitList();
		f4.setName("bottlegou");
		
		System.out.println(f1.getName());
		System.out.println(f1.getColour());
		List<FruitList> flist = new ArrayList<FruitList>();
		

		for (int i = 0; i < flist.size(); i++) {
			System.out.println(flist.get(i).getName());
		}
	}

}