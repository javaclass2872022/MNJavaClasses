package AbstractClass;

public abstract class Parent {
/*A class that is declared by keyword “abstract” is called an abstract class A class that is derived from the Abstract class 
 * must define all methods which are declared as abstract in an abstract class.*/
	
	// only abstract defined grand children should follow grandfathers rule not all children
	// abstract class can have abstract class and concrete class - which is fully defined methods
	
	//execution time, memory space , performance limitations of method overriding bought abstract class
	
	abstract void sum();
	abstract void sub();
	int a=100;
	int b=20;
	void show()
	{
		System.out.println("From Parent");
		System.out.println("a");
		System.out.println("b");
		
	}
 
}
