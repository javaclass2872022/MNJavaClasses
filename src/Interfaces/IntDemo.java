package Interfaces;

public class IntDemo implements I1,I2 {
	// all interface methods ae public and abstract
	// [abstract] - used if all methods are not implemented from interface 
	//class C2 extends C1 implements I1,I2,I3
	// as multiple inheritance is not available for class

	public void show()
	{
		System.out.println("Yey I understood interfaces!!!!!");
		
	}
	
	public static void main(String[] args)
	
	{
		IntDemo obj = new IntDemo();
		obj.show();
		
		
		
	}
	
}
