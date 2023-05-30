package main;
//Parent Class
class Parent{
	
	public Parent() {
		System.out.println( "Parent class Construstor with Zero Arguments");
	}
	public Parent(int a) {
		System.out.println("Parent class Construstor with Arguments");
	}
}
//Child Class
class Child extends Parent{
	
	public Child() {
		super();
	}
	public Child(int a) {
		super(a);
	}
}

public class Test {

	public static void main(String[] args) {
		Child child1 = new Child();
		Child child2 = new Child(5);
	}

}

//CONSTRUCTORS
/*
	 1. Constructors are specialized methods in a class that are automatically called when an object of that
	   class is instantiated using new keyword. 
	 2. When object is created constructor is called, no explicit return type, no return statement needed.
	 3. Constructor name must be same as class name.
	 4. We can overload constructors in a class and also use this() method to call a constructor within another
	   overloaded constructor.
	 5. If a constructor is not given then JVM internally creates a zero-arg constructor for that class which 
	   parent class constructor using super() method.  
	 */

	 //SUPER METHOD
	 /**
	 1. super() method is used to invoke parent class constructor with zero arg.
	 2. super() is automatically called by JVM if not explicitly given in child class constructor.
	 3. super(int a) will call the non-zero arg constructor from Parent class.
	 4. super(int a) must be specified by the programmer and parent class must contain a constructor which accepts arg.	
	 */