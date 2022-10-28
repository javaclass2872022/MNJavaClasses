package AbstractClass;

public class TestAbstract {
	
	public static void main(String[] args)
	{
		//Cant create abstract class objects
		child1 obj = new child1();
		obj.display();
		obj.sum();
		obj.sub();
		obj.show();
		
		
		child2 obj1 = new child2();
		obj1.display();
		obj1.sum();
		obj1.sub();
		obj1.show();
		
		// we can write circle and rectangle areas in child 1 and child 2 classes and call with that objects
	
		
	}

}
