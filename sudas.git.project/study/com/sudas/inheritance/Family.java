package com.sudas.inheritance;

import com.sudas.inheritance.Father.Mother;
import com.sudas.inheritance.Father.Vehicle;

import FileSystem.FileReader;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Father {
	String name;
	int age;

	public abstract void favouriteColour();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	class Mother extends Father {
		@Override
		public void setName(String name) {
			// TODO Auto-generated method stub
			super.setName(name);
		}
		
		@Override
		public void setAge(int age) {
			// TODO Auto-generated method stub
			super.setAge(age);
		}

		@Override
		public void favouriteColour() {
			// TODO Auto-generated method stub
			
		}

	}

	static class Vehicle {
	static final String REGISTRATION_NO="MH-12-JU-6937";

	}
}

class ChildOne extends Father {

	@Override
	public void favouriteColour() {
		// TODO Auto-generated method stub
		
	}

}

class ChildTwo extends Vehicle implements Connections{
	
	public  ChildTwo( String s) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getGas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInternet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mobileNumber() {
		// TODO Auto-generated method stub
		Connections.super.mobileNumber();
	}
}

class ChildThree extends ChildTwo
{
	public ChildThree(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getMoney() {
		// TODO Auto-generated method stub
	
		
		super.getMoney();
	}
}