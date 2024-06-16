package oop;

public class AmazonPayment {
	
	public void payment() {
		System.out.println("Pay after delivery");
	}
	
	
	public void payment(long cards) {
		System.out.println("enter card number");
		System.out.println(cards);
		}	
	
	
	public void payment(String banking){
		System.out.println(banking);
	}
	
	
	
	public void payment(long upi, String gpay) {
		System.out.println(upi);
		System.out.println(gpay);
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
AmazonPayment ap=new AmazonPayment();
ap.payment();
ap.payment(1556784856646l);
ap.payment("hdfc netbanking");
ap.payment(987634241, "smita45@gmail.com");
	}

}
