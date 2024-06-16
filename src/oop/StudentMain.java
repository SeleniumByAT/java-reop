package oop;

public class StudentMain {

	public static void main(String[] args) {
		
	Student stu1=new Student(1105, "Ram", 60, 70, 80);

		stu1.display();
		stu1.getStuMarks(60, 70, 80);
		stu1.getMarkSum();
		stu1.getMarksPercentage();
		
		System.out.println();
		 
		Student stu2=new Student(1106, "Shyam", 50, 60, 70);
		stu2.display();
		stu2.getStuMarks(50, 60, 70);
		stu2.getMarkSum();
		stu2.getMarksPercentage();
		
		
		System.out.println();
	}
	

	
	}




