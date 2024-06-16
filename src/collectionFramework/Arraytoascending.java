package collectionFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Arraytoascending {

	public static void main(String[] args) {
	ArrayList <Integer> a=new ArrayList <>();
	
	a.add(55);
	a.add(10);
	a.add(30);
	a.add(20);
	
	System.out.println(a);
	
	TreeSet <Integer> at=new TreeSet<> (a);
	
	at.addAll(a);
	System.out.println(at);
	
	
	
	
	
	
	
	

	}

}
