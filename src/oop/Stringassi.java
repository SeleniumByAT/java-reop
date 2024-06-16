package oop;

import java.util.Scanner;

public class Stringassi {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the enviroment");
		String s=sc.nextLine();
		
if(s.equalsIgnoreCase("Dev"))
{
	System.out.println("Welcome to the Dev enviroment");
}
else if(s.equalsIgnoreCase("QA"))
{
	System.out.println("Welcome to QA Enviroment");
}
else if(s.equalsIgnoreCase("Product"))
{
	System.out.println("Welcome to Product Enviroment");
}
else 
{
	System.out.println("Invalid input");
}
sc.close();			

	
	
	
	}

}
