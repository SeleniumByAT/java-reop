package exceptionHandle;

public class Practice {

	
	public static void main(String[] args) {
	
String s=null;
try {
	System.out.println(s.length());	
}
catch(Exception e) {
	System.out.println("Catch 1st exception");
}
	String x="abc";
	
		try {
			int i=Integer.parseInt(x);	
			System.out.println(i);
		}
		catch(Exception f) {
			System.out.println("Catch 2nd exception");
		}
		
		System.out.println("done thing");
	}

}
