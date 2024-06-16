package oop;

public class EncapsulationDemo {

	private int id=1111;
	private String pass="Smita123";
	
	public void setId(int a) {
		this.id=a;
	}
	public int getId() {
		return id;
	}
	
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	public void dologin(int id, String pass) {
		System.out.println(id);
		System.out.println(pass);
	}
	public static void main(String[] args) {
		

	}

}
