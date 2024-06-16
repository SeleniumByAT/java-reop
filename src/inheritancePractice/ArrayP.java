package inheritancePractice;

import java.util.ArrayList;

public class ArrayP {

	public static void main(String[] args) {
	String s0="My name is Archi";
	String[] s2=s0.split(" ");
	for(String i:s2) {
		System.out.println(i);
	}
	
	
	
		ArrayList <Integer> a=new ArrayList <>();
	a.add(40);
	a.add(20);
	a.add(30);
	
	
	System.out.println(a);
	a.sort(null);
	System.out.println(a);
	
	
	ArrayList <String> sa=new ArrayList <>();
	sa.add("tum");
	sa.add("badmash");
	sa.add("ho");
	
	sa.sort(null);
	System.out.println(sa);
	
	
	
	
	
	
	}

}
