package javafirstcode;

public class Parsley {

	public static void main(String[] args) {
		
		
	String s1="123";
		
	System.out.println(s1);
	
		int i=Integer.parseInt(s1);
		System.out.println(i+1);
	
		
		String s2="100.5";
		
		double d=Double.parseDouble(s2);
		System.out.println(d+10);
		
	
	int i2=1234;
	String s3=String.valueOf(i2);
	
	
	System.out.println(s3+1);
	
	boolean b=false;
	String b1=Boolean.toString(b);
	System.out.println(b1+1);
	
	String s4="12";
	
	byte by=Byte.valueOf(s4);
	System.out.println(by+1);
	
	
	int a=90;
	char a1= (char)a;
	
	System.out.println(a1);
	
	}
	
}