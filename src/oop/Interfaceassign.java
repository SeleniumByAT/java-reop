package oop;

interface CD{
	int a=30;
	int b=40;
	void sum();
}

interface AB{
	int x=5;
	int y=15;
	void mul();
}

public class Interfaceassign implements CD, AB {

	public void sum() {
		System.out.println(a+b);
	}
public void mul() {
	System.out.println(x*y);
	
}
	
	public static void main(String args[]) {
		
		Interfaceassign x=new Interfaceassign();
			
		x.sum();
		 x.mul();
		
	}
	
	
	
	
}
