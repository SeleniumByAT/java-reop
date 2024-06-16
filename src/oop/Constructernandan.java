package oop;

public class Constructernandan {
	int a;
	int b;
	double c;
	double d;
	Constructernandan(){
		System.out.println("nanu");
	}
		
	
	Constructernandan(int num1, int num2){
		
		a=num1;
		b=num2;}
		void display(){
			
		
		System.out.println(a+" "+b);
		System.out.println(a+b);
	}
	Constructernandan(double num3, double num4){
		
		c=num3;
		d=num4;}
	void show() {
		System.out.println(c+" "+d);
		System.out.println(c+d);
	}
Constructernandan(int num1, int num2, double num3){
	a=num1;
	b=num2;
	c=num3;}
	void print() {
System.out.println(a+" "+b+" "+c);
System.out.println(a+b+c);
}



public static void main(String args[]) {
	
	Constructernandan first=new Constructernandan();
	Constructernandan sec=new Constructernandan(10, 20);
	Constructernandan third=new Constructernandan(10.5, 20.60);
	Constructernandan forth=new Constructernandan(10, 20, 10.5);
	System.out.println(first);
	sec.display();
third.show();
forth.print();
	




}
}




