package Polymorphism;

public class DynamicBinding {
	public static void main(String[] args)
	{
		Parent obj= new Parent();
		obj.sum();
		
		obj= new Child1();
		obj.sum();
		obj= new Child2();
		obj.sum();
		
	}

}
