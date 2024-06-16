package javafirstcode;

public class ReverseNum {

	public static void main(String[] args) {

		int num=155;
		int rem;
		int sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum*10+rem;
			
		}
		System.out.println(temp+ " Reverse number is :" +sum);
		
		if(temp==sum) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a Palidrome number");
		}
		
		
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	int k=1;
		for(int i=5;i>=1;i--) {
			k=k*i;
			
		}
		
		System.out.println(k);
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		int a=10;
		int b=20;
		int c=b;
		 b=a;
		 a=c;
		
		System.out.println(a);
		System.out.println(b);
	
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");		
	int pal=0;
		int no=153;
		int temp1=no;
		
		int r;
		while(no>0) {
			r=no%10;
			no=no/10;
			pal=pal+(r*r*r);
			
	
		}
		
		System.out.println(pal);
	if(temp1==pal) {
		System.out.println("number is a armstrong number");
	}
	else {
		System.out.println("not a armstrong number");
	}
		
		
		
	}

}
