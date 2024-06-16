package javafirstcode;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		
		if(a==10 || a==50 || a==100) {
			System.out.println("valid number");
		}
		
		else {
			System.out.println("Invalid number");
		}
		
		
		if(a>0) {
			System.out.println("a is positive number");
		}
		
		else {
			System.out.println("a is negative number");
		}
		
		
	
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
