package oop;

public class Methodchainingh {

	 Methodchainingh m1() {
		System.out.println("m1 calling....");
		return this;
	}
	 Methodchainingh m2() {
		System.out.println("m2 calling....");
	return this;
	}
	Methodchainingh m3() {
		System.out.println("m3 calling....");
		return this;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methodchainingh mch=new Methodchainingh();

mch.m1().m2().m3();








	}

}
