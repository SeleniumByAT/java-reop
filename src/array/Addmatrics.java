package array;

public class Addmatrics {

	public static void main(String[] args) {

		
		  int a[][]=new int [2][2]; int b[][]=new int[2][2];
		 
		  a[0][0]=2; a[0][1]=4; a[1][0]=3; a[1][1]=5;
		  
		  b[0][0]=1; b[0][1]=5; b[1][0]=3; b[1][1]=2;
		  
		  int c[][]=new int[2][2];
		 
		  for(int i=0;i<a.length;i++) { for(int j=0;j<a.length;j++) {
		  System.out.println(a[i][j]); 
		  } 
		  }
		  for(int i=0;i<b.length;i++) { for(int j=0;j<b.length;j++) {
			  System.out.println(b[i][j]); 
  
		  }
		  int j = 0;
		System.out.println(c[i][j]);
		  c[i][j]=+a[i][j]+b[i][j];
		 
		  }
	
		  
		  
		  
		  
}
}