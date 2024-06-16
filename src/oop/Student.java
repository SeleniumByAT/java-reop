package oop;

public class Student {

	int SID;
	String Sname;
	  int sub1;
	  int sub2; 
	  int sub3;
	 
	

	
	Student(int ID, String name, int maths, int eng, int science){
		
		SID=ID;
		Sname=name;
	 sub1=maths; 
	 sub2=eng;
	 sub3=science;
		 
	}
	void display() {
		System.out.println(SID+" "+Sname+" "+sub1+" "+sub2+" "+sub3);
	}	

 void getStuMarks(int sub1, int sub2, int sub3)

 {
	 System.out.println(sub1+" "+sub2+" "+sub3);
 }
 
 void getMarkSum() {
	System.out.println(sub1+sub2+sub3); 
 }
 
 void getMarksPercentage() {
	 System.out.println((sub1+sub2+sub3)*100/300);
 }
 
 
}
	
	

		 
	 
	


