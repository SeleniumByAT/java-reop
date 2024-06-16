package oop;
class ABCD
{
	
	void m() {
		System.out.println("mmm");
	}
}
interface ABC{
	int a=10;
	  void m1();
		  
	  
	  
	  
}


interface XYZ{
	int b=20;
	void m2();
		
	
}







public class Interfacepractice extends ABCD implements ABC, XYZ{
	
public void m1() {
	System.out.println(a);
}

public void m2() {
	System.out.println(b);
}

	

	public static void main(String[] args) {
		
Interfacepractice x=new Interfacepractice();
x.m1();
x.m2();		
x.m();
		
	}

}
