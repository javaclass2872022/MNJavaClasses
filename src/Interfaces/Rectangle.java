package Interfaces;

public  class Rectangle implements Shape{
	double l,b;
	public void area()
	{
	l=34.55;
	b=78.99;
		double aor=2*l*b;
		System.out.println("Area is : " +aor);
	}

}
