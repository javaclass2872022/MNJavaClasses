package Interfaces;

interface FirstInterface {
//all variables are public static and final
	//can have only public class members
	//all grand children should follow grandfathers wishes, girl or boy
	
		  public void myMethod(); // interface method
		}

		interface SecondInterface {
		  public void myOtherMethod(); // interface method
		}

		class DemoClass implements FirstInterface, SecondInterface {
		  public void myMethod() {
		    System.out.println("FirstInterface");
		  }
		  public void myOtherMethod() {
		    System.out.println("Second Interface");
		  }
		}

		class InterfaceExample {
		 
		  
		  public static void main(String[] args) {
			  DemoClass Dc = new DemoClass();
			  Dc.myMethod();
			  Dc.myOtherMethod();
		  }
		} 
