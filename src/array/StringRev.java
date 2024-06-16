package array;

public class StringRev {

	public static void main(String[] args) {
	String s="Archi";
System.out.println();
	 String s1="";
	for(int i=4;i>=0;i--) {
		
		s1=s1+s.charAt(i);
		
	}
	
System.out.println(s1);


String s3="Nandan,Archi,Vivaan";

String[] arr=s3.split(",");

for(String i:arr) {
	System.out.println(i);
}




	
	StringBuilder sc=new StringBuilder("Pandey");
	
System.out.println(sc.reverse());
	 
	
	
	}

}
