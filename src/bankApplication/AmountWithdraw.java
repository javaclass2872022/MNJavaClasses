package bankApplication;

import java.util.Scanner;

public class AmountWithdraw extends AmountDeposit{
	double WithAmount;
	
public void Withdraw1()
{
	
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	System.out.print("Enter Withdraw amount- ");  
	WithAmount= sc.nextDouble(); 
	
	balance=balance-WithAmount;
	System.out.print("Current bal- "+balance);  
	
}



}
