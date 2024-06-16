package oop;


public class Construc2 {
static int a;
static int b;
double c;
double d;




Construc2(int num1, int num2){
	this(10.5, 20.50);
	a=num1;
	b=num2;
	
	
}
Construc2(double num3, double num4){
	
	c=num3;
	d=num4;
	
}
Construc2(int num1, int num2, double num3){
	
}



static public void main(String args[]) {
	
	Construc2 x=new Construc2(1, 2);
	
    //Construc2 y=new Construc2(10.5, 20.50);
	a=100;
	b=200;
	System.out.println(a+b);
	System.out.println(x.c+x.d);	
	//System.out.println(x.a+x.b+y.c);
	
	
}



}
