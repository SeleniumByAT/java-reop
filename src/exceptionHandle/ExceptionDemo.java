package exceptionHandle;

public class ExceptionDemo {

	public static void main(String[] args) {
		String s=null;
		try
		{
		System.out.println(s.length());}
		catch(NullPointerException e)
		{
			System.out.println("Please enter valid String\t"+e.getMessage());
		}
		
		int a[]= {12, 30, 15};
		try {
System.out.println(a[3]);}
		catch(Exception v) {
			System.out.println(v.getMessage());
		}
	}
}

