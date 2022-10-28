package Interfaces;

public class Circle implements Shape
{
	double rad,aoc;
	public void area()
	{
		rad=2.5;
		aoc=pi*rad*rad;
		System.out.println("Area is : " +aoc);
	}
	
}
