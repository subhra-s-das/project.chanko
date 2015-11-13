package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SimpleSorting().simplesort();

	}

}

class CarList implements Comparable<CarList> {
	String name;
	String brand;

	public CarList(String name, String brand) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public int compareTo(CarList o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}

}

class CreateCarList {
	public void carlist() {

		CarList car1 = new CarList("verna", "Hyundai");
		CarList car2 = new CarList("Swift", "maruti");
		CarList car3 = new CarList("i10", "hyundai");
		CarList car4 = new CarList("Polo", "vw");
		CarList car5 = new CarList("beat", "Chevy");
		CarList car6 = new CarList("FordMustand", "ford");
		CarList car7 = new CarList("a4", "Audi");

		List<CarList> carlists = new ArrayList<CarList>();

		carlists.add(car1);
		carlists.add(car2);
		carlists.add(car3);
		carlists.add(car4);
		carlists.add(car5);
		carlists.add(car6);
		carlists.add(car7);

		Collections.sort(carlists);

	}

}

class sortList {
	public void sort() {
		List<String> list1 = Arrays.asList("Hello", "there", "Is", "Home", "cat", "dog");
		List<String> list = new ArrayList<String>();
		list.addAll(list1);


		
		
	
	}
}

class ReverseSort {
	public void reversesort() {
		List<String> list1 = Arrays.asList("java", "C++", "python", "cobox", "Object C", "androiD");
List<String> list2 = Arrays.asList("java", "C++", "python", "cobox", "Object C", "androiD");

		
	}
}



class SimpleSorting
{
	public void simplesort()
	{
		List<String> list = Arrays.asList("java", "C++", "python", "cobox", "Object C", "androiD");
		Object[] array = list.toArray();
		
		Arrays.sort(array);
		for (int i=0;i<array.length;i++)
		{
			System.out.println(array[i].toString());
		}
	
		System.out.println(list);
	}
	
	
	
}