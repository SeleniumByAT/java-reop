package javafirstcode;

public class ArrayPractice {

	public static void main(String[] args) {

		int a[][] = { { 2, 3, 4 }, { 4, 3, 5 } };
		int b[][] = { { 3, 9, 4 }, { 7, 3, 4 } };

		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(b.length);
		System.out.println(b[0].length);
		System.out.println("------------------------");

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[0].length - 1; j++) {
				if (a[i][j] % 2 == 0) {
					System.out.println("Even number");
				} else {
					System.out.println("Odd number");
				}System.out.println(a[i][j]);
		}
		}
		for (int i = 0; i <= b.length - 1; i++) {
			for (int j = 0; j <= b[0].length - 1; j++) {
				if (b[i][j] % 2 == 0) {
					System.out.println("Even number");
				} else {
					System.out.println("Odd number");
				}
				System.out.println(b[i][j]);
			}
	}
	}
}
