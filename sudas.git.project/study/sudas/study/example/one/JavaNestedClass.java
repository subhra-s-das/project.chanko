package sudas.study.example.one;

import sudas.study.example.one.OuterClass.InnerClass;
import sudas.study.example.one.OuterClass.StaticInnerClass;

public class JavaNestedClass {

	public static void main(String[] args) {

		OuterClass outerclass = new OuterClass();
		OuterClass.InnerClass innerclass = outerclass.new InnerClass();

		// accessing OuterClass methods
		outerclass.setOuterID("Outer ID");
		outerclass.setOuterName("Outer Name");

		// accessing other methods from Outer Class
		outerclass.accessInner();

		// accessing inner class methods
		innerclass.setInnerID("Inner ID");
		innerclass.setInnerName("Inner Name");

		/*
		 * Nested classes are divided into two categories: static and
		 * non-static. Nested classes that are declared static are simply called
		 * static nested classes. Non-static nested classes are called inner
		 * classes.
		 */

		// static
		OuterClass.StaticInnerClass nestedClass = new StaticInnerClass();

	}

}

class OuterClass {
	// Outer class fields
	String outerName;
	String outerID;

	// access inner class methods and instance variables
	public void accessInner() {
		InnerClass innerclass = new InnerClass();

		innerclass.setInnerID("INNER_ID access innerclass method from outer class");
		innerclass.setInnerName("INNER_NAME access innerclass method from outer class");

	}

	public String getOuterName() {
		return outerName;
	}

	public void setOuterName(String outerName) {
		this.outerName = outerName;
	}

	public String getOuterID() {
		return outerID;
	}

	public void setOuterID(String outerID) {
		this.outerID = outerID;
	}

	class InnerClass {
		// Inner class fields
		String innerName;
		String innerID;

		public String getInnerName() {
			return innerName;
		}

		public void setInnerName(String innerName) {
			this.innerName = innerName;
		}

		public String getInnerID() {
			return innerID;
		}

		public void setInnerID(String innerID) {
			this.innerID = innerID;
		}

		// access Outerclass methods and instance variables
		public void accessOuter() {
			OuterClass outer = new OuterClass();
			outer.getOuterID();

		}

	}

	static class StaticInnerClass {
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
