package javafirstcode;

import oop.Calcu1;

public class Calculator {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	int div(int a, int b) {
		return a/b;
	}
	
	int mul(int a, int b) {
		return a*b;
	}
	
	void stu(Calcu1 calcu1) {
		System.out.println(calcu1);
	}
	
		
	
	
	
	
	

	public static void main(String[] args) {
		
		Calculator res=new Calculator();
		Calcu1 res2=new Calcu1("kanstruter ka parameter hai ye ");
		
		
	int a=20;
	int b=10;
	res.add(a, b);
	res.sub(a, b);
	res.mul(a, b);
	res.div(a, b);
	System.out.println(res.add(a, b));
	System.out.println(res.sub(a, b));
	System.out.println(res.mul(20, 10));
	System.out.println(res.div(20, 10));
	res.stu(res2);
	
	
	
}
}