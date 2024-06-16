package oop_Interface;

public class Aiims implements IMC,IMA
{
	

	@Override
	public void nuero() {
		System.out.println("AIIMS have Nuero dept.");
		
	}

	@Override
	public void childcare() {
		System.out.println("AIIMs have child specialist");
		
	}
	
	void ENT() {
		System.out.println("AIIMS have ENT dept");
	}



public static void main(String[] args) {
Aiims ac=new Aiims();
IMC ca=new Aiims();
IMA aa=new Aiims();
WHO w=new Aiims();
ac.childcare();
ac.ENT();
ac.nuero();
ac.ortho();
ac.emergency();
ac.CovidTest();
System.out.println("--------------------------");
ca.nuero();
ca.childcare();
ca.CovidTest();
System.out.println("--------------------------");
aa.nuero();
aa.emergency();
aa.ortho();
aa.CovidTest();
System.out.println("--------------------------");
w.CovidTest();


}

@Override
public void emergency() {
	System.out.println("AIIMS have Emergency dept");
	
}

@Override
public void ortho() {
	System.out.println("AIIMS have ortho dept");
	
}

@Override
public void CovidTest() {
	System.out.println("Covid test is compulsory");
	
}
}