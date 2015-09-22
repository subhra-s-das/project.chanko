package sudas.study.example.one;

public class AbstructClass {

	public static void main(String[] args) {

		/*
		 * SUPER CLASS SUB CLASS create a subclass object and access all the
		 * superclass instance variable and methods
		 */

		Child child = new Child();
		child.name = "---By createing a child class object---";
		child.name();

		/*
		 * SUPER CLASS SUB CLASS POLYMORPHISM and DYNAMIC METHOD DISPATCH even i
		 * can do polymorphism superclass variable = new SubclassObject
		 */

		Parent p = new Child();
		p.name = "---Dynamic method dispatch decides on runtime whic method to call---";
		/*
		 * If you don't initialize the variable you will get null depending on
		 * the object the method would be called (DYNAMIC METHOD DISPATCH) in
		 * this case the Child() object is created so methods related to child
		 * object would be called.
		 */
		p.name();

		/*
		 * a static method available within class is notinherited has to call by
		 * class name
		 */
		Parent.scientificName();
		// scientificName() is a static method in parent class

		/*
		 * ABSTRACT CLASS creating object of abstract class is not possible if
		 * you do you will create a anonymous inner class
		 */

		abstractA abstract1 = new abstractA() {

			@Override
			public int intabstractMethod() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void abstractMethod() {
				// TODO Auto-generated method stub

			}
		};

		// accessing a static method within abstract class
		abstractA abstract2 = abstractA.staticMethod();
		// abstract2.intabstractMethod(); // this gives you a null pointer
		// exception

		// creating object of extended abstract class
		extendedAbstractClass extended = new extendedAbstractClass();
		extended.abstractMethod();
		extended.intabstractMethod();

		/*
		 * INTERFACE
		 */

		interfaceClass my0 = new interfaceClass();
		my0.abstractMethod();
		my0.InterfaceDefaultMethod();

		MyInterface my = new interfaceClass();
		my.abstractMethod();
		my.InterfaceDefaultMethod();

		/*
		 * class NewimplementInterface extends abstractA implements
		 * MynewInterface
		 */

		/*
		 * creating an object of interface creates anonymous inner class like
		 * creating object of abstract class
		 */

		MynewInterface my1 = new NewimplementInterface();

	}

}

// this is a super class
class Parent {
	// super class instance variable
	String name;
	int age;

	// super class class variable
	static String scientificName = "Homo";

	// super class instance method
	public void name() {
		System.out.println("Super class instance method " + name);
	}

	// super class instance method with a return type
	public String getName() {
		System.out.println("Super class instance method with return type "
				+ name);
		return name;
	}

	// super class static/class method
	public static void scientificName() {
		System.out.println("Super class static method " + scientificName);
	}
}

/*
 * this is a subclass of parent. Subclass extends superclass through a subclass
 * object you can access the instance variable and methods of superclass. The
 * reverse is not possible.
 */
class Child extends Parent {
	String gender;

	// subclass instance method
	public void gender() {
		System.out.println("Subclass instance method " + gender);
	}

	// subclass static method
	public static void play() {
		System.out.println("Subclass ststic method ");
	}

	// methods from parent class can be overridden into subclass
	// overridden methods are nothing but a copy of superclass method but just a
	// new version and
	// functionality. You can always call super class methods to subclass but
	// only within the overridden method

	// this is a overridden method. This method in parent class does not have a
	// return type.
	@Override
	public void name() {
		System.out.println("Subclass Child instance method " + name);
		// super.name();
	}

	// this is a overridden method. This method in parent class has String
	// return.
	@Override
	public String getName() {
		// not sure why some one would do that
		super.name = "Test";
		return super.getName();
	}

}

class Siblings extends Child {
	// this class can inherit all methods from Child (which is superclass) of
	// Siblings and it can inherit methods from Parent which is superclass for
	// Child

	// overridden method of Superclass Parent
	@Override
	public void name() {
		super.name();
	}

	// overridden method of Superclass Patent
	@Override
	public String getName() {
		return super.getName(); // the superclass Child method getName has
								// return type
	}

	// overridden method of Superclass Child
	@Override
	public void gender() {
		// TODO Auto-generated method stub
		super.gender();

	}
}

abstract class abstractA {
	// a normal method within abstract class
	public void normalMethod() {
		System.out.println("I am a normal method within class abstractA");
	}

	// a static method within abstract class
	public static abstractA staticMethod() {
		System.out.println("I am a static method within class abstractA");
		return null;
	}

	/*
	 * you can declare a class a abstract even if you don't have a abstract
	 * method with the abstract class. But remember you cannot make a abject /
	 * instantiate an abstract class. If you create object of abstract class it
	 * creates anonymous inner classes do not make methods private. Private
	 * modifiers are against inheritance
	 */

	// it is responsibility of the extended class to implement the method body

	// abstract method within abstract class
	public abstract void abstractMethod();

	// you can even have a return type to the abstract class
	public abstract int intabstractMethod();

}

// A class can extends a abstract class. When you extend the class with abstract
// class
// you have to implement all the overridden method from abstract class
class extendedAbstractClass extends abstractA {

	@Override
	public void abstractMethod() {
		System.out
				.println("This is from extended abstract class from abstractMethod");
	}

	@Override
	public int intabstractMethod() {
		System.out
				.println("This is from extended abstract class from intabstractMethod");

		// ******************************************************************************************************
		// calling a normal method from Abstract class within abstract method
		// inherited from abstract class
		// ******************************************************************************************************

		super.normalMethod();
		return 0;

	}

}

interface MyInterface {
	/*
	 * interface method can be either be static, abstract or default method.
	 * Default method add new functionality to the interface.
	 * 
	 * For example you want to add a new functionality i.e. a new method into
	 * the interface at later stage. Now class which has already implemented the
	 * old interface will break unless the new method is overridden. This
	 * problem can be solved by default methods * Default METHODS ARE ALLOWED
	 * ONLY IN INTERFACE. So when you implement the interface to a class where
	 * all the methods within a interface are abstract you need to implement(add
	 * body) to the class where you have implemented the interface You cannot
	 * have a static method without body
	 */

	// default method
	default void InterfaceDefaultMethod() {
		System.out.println("I am a default method in MyInterface ");
	}

	// abstract method
	void abstractMethod();

	// static method
	static void ststicMethod() {
		System.out.println("I am a ststic method in MyInterface ");
	}

}

/*
 * as an alternative instead of adding a default method a interface can also be
 * extended. For example I will create a new interface MynewInterface which will
 * extends the MyInterface so when some one implements the MynewInterface all
 * methods would be accessible. No programmers have a choice whether to upgrade
 * the interface or stay with the old one
 */

interface MynewInterface extends MyInterface {

	/*
	 * here you will not implement the unimplemented methods from MyInterface it
	 * is the the class which implements MyInterface OR MynewInterface will
	 * implement the incomplete methods new abstract method
	 */

	public void InterfaceAbstractMethod();

}

/*
 * this is a class which implements the interface My interface you can implement
 * multiple interface (i.e interface support multiple inheritance where as you
 * can only extend one class when you implement interface on a class all
 * abstract methods are overridden within the class
 */

class ImplementInterface implements MyInterface {

	/*
	 * here you have a choice which interface to implement. if you implement the
	 * MynewInterface you will get MyInterface methods as well as MynewInterface
	 * methods.
	 */

	// abstract method overridden from interface
	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
	}
}

/*
 * a class can implement a interface , in fact can implement multiple interface
 * also the same class can extend a class. You can extend Superclass/ parent
 * class/ normal class. When you extend a super class, naturally you have to
 * implement all the methods belonging to abstract class. Abstract class does
 * not support multiple inheritance. When you use extends and implements both
 * use extends first
 */
class NewimplementInterface extends abstractA implements MynewInterface {

	// this is a overridden method from Abstract class
	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub

		/*
		 * Don't even think that you can access the other methods using the
		 * super. This is a implemented interface not an extended class :-)
		 */
	}

	// this is a overridden method from
	@Override
	public void InterfaceAbstractMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public int intabstractMethod() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class interfaceClass implements MyInterface {

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub

	}

}