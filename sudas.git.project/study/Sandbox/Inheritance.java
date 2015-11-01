package Sandbox;

import sudas.com.junit.selenium.Login;

public class Inheritance {

	public static void main(String[] args) {
A a = new A();
a.name("sharu");
		B b = new B();
		b.name("sudas");
	}

}

class A {
	String name;
	String lastName;

	public void name(String name)

	{
		this.name = name;
		System.out.println(name);
	}

}

class B extends A {
	@Override
	public void name(String name) {
	System.out.println(new A().name.length());
		
	
		// TODO Auto-generated method stub
		super.name(name);
	}
}