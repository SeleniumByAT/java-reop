package array;

public class Arraystringassign {

	public static void main(String[] args) {
		
		String a[]=new String[5];
		
		a[0]= "ram";
		a[1]= "shyam";
		a[2]= "sohan";
		a[3]= "mohan";
		a[4]= "ramesh";
		
		
		for(int i=0;i<a.length;i++) {
		//	System.out.println(a[i]);
			
			if(a[i]=="ramesh") {
				System.out.println("shyam is there:"+i);
			break;
			}
			else {
				System.out.println("shyam is not there");
			}
			
			
		}
		
		
		

	}

}
