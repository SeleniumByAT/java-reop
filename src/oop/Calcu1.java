package oop;

public class Calcu1 {

	public Calcu1(String s) {
		//System.out.println(s);
	}

	public Calcu1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void add(int x, int y){
		System.out.println(x+y);
	}
	
	void add(int x,int y, int z) {
		System.out.println(x+y+z);
	}
	
	void add(double x, double y) {
		System.out.println(x+y);
	}
	
	void add(double x, double y, double z) {
		System.out.println(x+y+z);
	}
	

public static void main(String args[]) {
	
Calcu1 add=new Calcu1();
add.add(10.5, 10.6);
add.add(10, 20);
add.add(10, 20, 30);
add.add(10.5, 15.60, 20.5);

}









}