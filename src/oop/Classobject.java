package oop;

public class Classobject {

	public static void main(String args[]) {
		
		int num=432;
		int r;
		int sum=0;
		int temp=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			sum=sum*10+r;
		}
		
		System.out.println(sum);
		
		System.out.println(sum+ " is a reverse of number "+temp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
