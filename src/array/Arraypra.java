package array;

public class Arraypra {

	public static void main(String[] args) {
	Object id[][]={{"Admin","admin123"}, {"Tester1","test123"}, {"Tester2","test123"}};
	
System.out.println(id.length);
System.out.println(id[0].length);
	
	/*for(int i=0;i<id.length;i++) {
		for(int j=0;j<id[0].length;j++) {
			System.out.println(id[i][j]);
		}
		System.out.print("");
	}
	*/
	
	
	for(Object i[]:id) {
		for(Object j:i) {
			System.out.println(j);
		}
	}
	
	
	
	
	
	}

}
