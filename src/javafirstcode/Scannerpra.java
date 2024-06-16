package javafirstcode;

import java.util.Scanner;

public class Scannerpra {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		//System.out.println(a);
		//System.out.println(b);
		System.out.println("Sum of two number is:"+(a+b));
		
		System.out.println((a>b)+" :a is largest");
		System.out.println((b>a)+" :b is largest");
		sc.close();
	}

}
