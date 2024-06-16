package oop;

class A{
	int a;
	void display() {
		System.out.println(a);
	}
		
	
}
class B extends A{
	int b;
	void show() {
		System.out.println(b);
	
	}
}

class C extends B{
	int c;
	void print() {
		System.out.println(c);
	}
}





public class InheritanceP {
	public static void main(String args[]) {
		System.out.println("Class A");
		
		A aobj=new A();
		aobj.a=100;
		aobj.display();
			System.out.println("Class B");	
		B bobj=new B();
		bobj.a=10;
		bobj.b=20;
		bobj.display();
		bobj.show();		
			System.out.println("Class C");	
		C cobj=new C();
		cobj.a=25;
		cobj.b=30;
		cobj.c=35;
		cobj.display();
		cobj.show();
		cobj.print();
				
				
				
			
		
		
		
		
		
		
		
	}

	
}