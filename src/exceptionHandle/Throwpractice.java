package exceptionHandle;

public class Throwpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
	
		System.out.println(a+b);
		System.out.print("A is largest:");
		Thread.sleep(5000);
		
		
		System.out.println(a<b && b>a);
		
		System.out.print("B is largest:");
		System.out.println(b<a && a>b);
		
		
	}

}
