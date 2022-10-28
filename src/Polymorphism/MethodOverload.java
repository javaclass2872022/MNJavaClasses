package Polymorphism;

public class MethodOverload {
	void sum(int a, int b)
	{
		System.out.println(a+b);
		
	}
	
	void sum(double a, double b)
	{
		System.out.println(a+b);
		
	}
	
	void sum(int a, double b)
	{
		System.out.println(a+b);
		
	}
	
	void sum(double a, int b)
	{
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args)
	{
		MethodOverload obj= new MethodOverload();
		obj.sum(34.55, 4567.888);
		obj.sum(34, 4567);
		obj.sum(34, 4567.888);
		obj.sum(34.55, 4567);
		
	}
}
