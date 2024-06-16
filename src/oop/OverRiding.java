package oop;

class A1
{
	void display() 
	{
		System.out.println("This is parent class");
	}
}

class B1 extends A1
{
	void display() 
	{
		System.out.println("This is child b class");
	}
	void show() {
		System.out.println("seprate b method");
	}
}


class C1 extends A1
{
	void display() 
	{
		System.out.println("This is child c class");
	}
	void show() {
		System.out.println("seprate c method");
	}
}







public class OverRiding {

	public static void main(String[] args) {
A1 a=new A1();
B1 b=new B1();	
C1 c=new C1();		
A1 ab=new B1();		
A1 ac=new C1();		
a.display();		
System.out.println("-------------------------------");
b.display();
b.show();
System.out.println("-------------------------------");
c.display();
c.show();
System.out.println("-------------------------------");
ab.display();
ac.display();














	}

}
