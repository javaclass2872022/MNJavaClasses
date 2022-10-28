package Polymorphism;

public class Parent {
	//binding child class object with parent class type at run time is called dynamic binding
	//used when single parent has multiple child classes
	// parent(type) obj= new child(reference)();
	//helps in memory reuse leading to less execution time
	//parents memory is used my all children
	
	void sum()
	{
		int a =10;
		int b =20;
		int c=a+b;
		System.out.println("parent sum:"+c);
	}
	

}
