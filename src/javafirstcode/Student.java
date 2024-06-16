package javafirstcode;

import java.util.ArrayList;
import java.util.Iterator;



public class Student {
	int sid;
	String sname;
	int smarks;
	
	public Student(int id, String name, int marks)
	{
		sid=id;
		sname=name;
		smarks=marks;

	}
	
	
	
	/*
	 * @Override public String toString() { return "Student [sid=" + sid +
	 * ", sname=" + sname + ", smarks=" + smarks + "]"; }
	 */



	public static void main(String args[]) {
	
	
	
	
	 Student s1=new Student(101, "Ram", 70);
	 Student s2=new Student(102, "Shyam", 75);
	 Student s3=new Student(103, "Roshan", 60);
	
	ArrayList <Student> al1=new ArrayList <>();
	al1.add(s1);
	al1.add(s2);
	al1.add(s3);
	
	Iterator<Student> it =al1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	for (Integer i = 0; i < al1.size(); i++) {
		
		System.out.println(al1.get(i).sid);
		System.out.println(al1.get(i).sname);
		System.out.println(al1.get(i).smarks);
	}
/*System.out.println(al1.get(0).sid);
System.out.println(al1.get(0).sname);	
System.out.println(al1.get(0).smarks);	
System.out.println(al1.get(1).sid);
System.out.println(al1.get(1).sname);	
System.out.println(al1.get(1).smarks);	
System.out.println(al1.get(2).sid);
System.out.println(al1.get(2).sname);	
System.out.println(al1.get(2).smarks);	*/
			
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
