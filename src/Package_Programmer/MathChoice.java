package Package_Programmer;


import java.util.*;//inbuilt package

import Packages.Operations; //programmer defined package

public class MathChoice extends Operations {
	//if we remove extends also we can run program by making sum function public
	
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter 2 integers:");
		int x= sc1.nextInt();
		int y = sc1.nextInt();
		int res = Operations.sum(x,y);
		System.out.println("sum is :"+res);
		
		 res = Operations.sub(x,y);
		System.out.println("subtraction is :"+res);
		
		 res = Operations.div(x,y);
		System.out.println("division is is :"+res);
		
		 res = Operations.mul(x,y);
		System.out.println("multiplication is :"+res);
		
	
	}

}
