package oop;

abstract class Bank{  
	  abstract double roi();  
	}  

class SBI extends Bank{

	@Override
	double roi() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class ICICI extends Bank{

	@Override
	double roi() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Axis extends Bank{

	@Override
	double roi() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}







public class MethodOverwriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bank sbi=new SBI();
	System.out.println(sbi.roi());	
	
	ICICI icici=new ICICI();
	System.out.println(icici.roi());	
		
		
	Axis axis=new Axis();
	System.out.println(axis.roi());	
		
		
		
		
	}

}
