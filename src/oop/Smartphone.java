package oop;



public class Smartphone extends Phone{
	String use="Video call and online text";
	String features="advance";
	void display() {
		System.out.println(super.use);
		System.out.println(super.features);
		System.out.println(use);
		System.out.println(features);
	}
	void print() {
		super.print();
		System.out.println("phone is advance, call camera web access");
		}
	Smartphone(){
		super();
		System.out.println("to click, to surf, to chat, to call");
		
	}
	
	
	
	public static void main(String[] args) {
		
		Smartphone cell=new Smartphone();
		
		cell.display();
		cell.print();
		
	}

}
