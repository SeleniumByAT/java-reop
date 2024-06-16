package javafirstcode;

public class Practice {
	int roll;
	String name;
void display() {
	System.out.println(roll);
	System.out.println(name);
}


public static void main(String args[]) {
	
Practice stu1=new Practice();
stu1.name= "Ram";
stu1.roll=1010;
System.out.println(stu1.name);

try {

System.out.println(stu1.roll/0);

}
catch(Exception e){
	System.out.println("skip");
}

System.out.println(stu1.name);



}











}
