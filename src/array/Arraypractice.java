package array;

public class Arraypractice {
	public static void main(String args[]) {

		int a[] = new int[5];

		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		 
		
		//int c=0;
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	//c=c+a[i];
	 if(a[i]%2==0) {
		 System.out.println("even number");
		 
	 }
	 else {
		 System.out.println("odd number");
	 }
	}







//System.out.println(c);
	}
}