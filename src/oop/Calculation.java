package oop;

public class Calculation {

	int a;
	int b;
	int c;
	
	Calculation(int a, int b, int c){
	this.a=a;
	 this.b=b;
	this.c=c;
	}
	void display(){
		System.out.println(a+" "+b+" "+c);
	}
	
	void getValue() {
		System.out.println(a+b+c);
	}
	
	
	public static void main(String args[]) {
		
		
		Calculation cal=new Calculation(100, 200, 300); 
	cal.display();
	cal.getValue();
		


		
	
	
	
	
	
		
	
		}
	
	
}
