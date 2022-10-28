package bankApplication;

import java.util.Scanner;

public class AmountDeposit extends AccontDetails{
	double Depamount;
	
	
public void Deposit1()
{  
	System.out.println("Current bal- "+balance);  
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	System.out.println("Enter Deposit amount- ");  
	Depamount= sc.nextDouble(); 
	//System.out.print("Current bal- "+balance);  
	
	balance=balance+Depamount;
	System.out.println("Current bal after- "+balance);  
	
}
}
