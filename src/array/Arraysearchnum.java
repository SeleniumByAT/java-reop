package array;

public class Arraysearchnum {
	public static void main(String args[]) {

		int a[] = new int[5];
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
		a[3] = 3;
		a[4] = 2;

		for (int i : a) {

			if (i%2==0) {
								System.out.println(i+" even number");}
				else{
				
					
					System.out.println(i+" odd number");
				}
					
			}
for(int i:a) {
	if(i==3) {
		System.out.println("3 is available");
	}
}
		}

	}


