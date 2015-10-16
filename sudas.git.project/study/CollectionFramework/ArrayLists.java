package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		Students student1 = new Students("John", "two", "abc", 12);
		Students student2 = new Students("Allen", "two", "abc", 12);
		Students student3 = new Students("bob", "three", "abc", 15);
		Students student4 = new Students("amanda", "Four", "abc", 16);
		Students student5 = new Students("Dave", "five", "abc", 16);

		List<Students> studentList = new ArrayList<Students>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(new Students("sudas", "twelve", "XyZ", 21));

		// studentList.sort(null);

		Collections.sort(studentList, new Comparator<Students>() {

			public int compare(Students o1, Students o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});

		Iterator<Students> sList = studentList.iterator();
		while (sList.hasNext()) {
			System.out.println(sList.next().getName());

		}
	}

}

class Students {
	String name;
	String grade;
	String address;
	int age;

	public Students(String name, String grade, String address, int age) {
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}