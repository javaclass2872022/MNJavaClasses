package Polymorphism;

public class C extends P{
	void mobile()
	{
		System.out.println("iPhone 13");
	}
	
	void marryChild()
	{
		System.out.println("PQR");
	}
	
	public static void  main(String k[])
	{
		P obj= new P();
		obj.car();
		obj.gold();
		obj.marryChild();
		//obj.mobile();
		
	
	}

}
