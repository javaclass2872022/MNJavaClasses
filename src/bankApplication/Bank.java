package bankApplication;

import java.io.IOException;
import java.util.Scanner;

public class Bank{

	public static void main(String[] args) {
		
		// TODO Auto-generated method 
		System.out.println("hello");
		
		AmountWithdraw wit=new AmountWithdraw();
	wit.adduser();  
		wit.viewuser(); 
		
		//mountDeposit dep=new AmountDeposit(); 
		//dep.Deposit1(); 
	
				@SuppressWarnings("resource")
				Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
				while(true)
				{
				System.out.println("Enter 1 to Deposit and 2 to Withdraw and 3 to exit- ");  
				int op= sc.nextInt();  
				
				if (op==1)
				{
					
					wit.Deposit1(); 
				}
				else if(op==2)
				{
					
					wit.Withdraw1();
					
				}
				
				else
				{
					  System.exit(0);
				}
				}
				//sc.close();
	}

}
