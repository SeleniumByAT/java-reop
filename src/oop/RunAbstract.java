package oop;

public class RunAbstract extends AbstractDemo {


	@Override
	void show() {
	System.out.println("this is child abstract method");
	}
	void print() {
		System.out.println("this is seprate child method");
	}
	public static void main(String[] args) {
	
		
		RunAbstract ra=new RunAbstract();
		
		ra.display();
		ra.show();
		ra.print();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
