package bankApplication;

import java.util.Scanner;

public class AccontDetails {
	
	Integer accountno;
	String name;
	Double balance;
	
	void adduser()
	{
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter Account number- ");  
		accountno= sc.nextInt();  
		System.out.print("Enter Name- ");  
		name= sc.next();  
		System.out.print("Enter Balance- ");  
		balance= sc.nextDouble();  
		
		   

	}
	
	void viewuser()
	{
		System.out.println("Account number- " +accountno); 
		System.out.println("Name- "+name); 
		System.out.println("Balance- "+balance); 
	}
	
	void checkbalance()
	{
		System.out.print("Balance: "+balance); 
		//return(balance);
	}
	

}
