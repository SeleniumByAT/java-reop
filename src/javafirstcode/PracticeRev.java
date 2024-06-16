package javafirstcode;

import java.util.Scanner;

public class PracticeRev {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		System.out.println(sb.reverse());
		
		
		StringBuilder sb1=new StringBuilder(String.valueOf(356987));
		
		System.out.println(sb1.reverse());
		
		sc.close();
		
		
		
		

	}

}
