package main;

interface Banking{
	
	public abstract void withdraw(double amount);
	
	public void deposit(double amount);
	
	
}

abstract class Customer{
	
	public abstract String getCustomerName();
	public void createCustomerAccount() {
		System.out.println("Customer Account Created");
	}
}
//ABSTRACT 
/*
 1. An abstract class is a class that cannot be instantiated and is typically used as a base class for other classes.
 2.It can contain both abstract and non-abstract methods.
 3.Abstract methods are declared without an implementation and must be overriden by the subclasses.
 4.It can have instance variables and constructors.
 5.Subclasses can extend only one abstract class.
 */

 //INTERFACE
 /*
	1.An interface is a contract that defines a set of methods that a class must implements.
	2.It can only contain method signatures and constant fields.
	3.All methods declared in a interface are implicitly public and abstract.
	4.A class an implements multiple interfaces.
	5.It is used to achive multiple interfaces in java.
  */

	//DIFFERENCE BETWEEN ABSTRACT AND INTERFACE
	/*
	 1. An abstract can have both abstract and non-abstract methods,while an interface can only have method signatures.
	 2. Abstarct classes can have instance variables, constructors, and non-public members, while interface can only have constant fields.
	 3. A class can extends only one abstract class, but it can implements multiple interfaces.
	 4. Abstract classes provide a level of implementation, while interfaces are purely for specifying the contract.
	 */