package oop;

class teacher{
	
	String designation="teacher";
	String collegename="begginersbook";
	void display() {
		System.out.println("teaching......");
	}
}

class computerTeacher extends teacher{
	void show() {
		System.out.println("computer teaching...");
	
	}
}


public class InharitanceAssignment {
	public static void main(String args[]) {
		
	
	computerTeacher ct=new computerTeacher();
	System.out.println(ct.collegename);
	System.out.println(ct.designation);
	ct.display();
	ct.show();
	
	
	
	
	

}
}