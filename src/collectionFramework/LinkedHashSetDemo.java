package collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	LinkedHashSet <Integer> lhs=new LinkedHashSet <>();
	lhs.add(20);
	lhs.add(30);
	lhs.add(50);
	lhs.add(40);
	lhs.add(null);
		
	System.out.println(lhs);
		System.out.println(lhs.size());
		
		System.out.println(lhs.hashCode());
		System.out.println("-------------------");
		
		Iterator <Integer> lhs1=lhs.iterator();
		while(lhs1.hasNext()) {
			System.out.println(lhs1.next());
		}
		System.out.println(lhs.contains(0));
	
		
	}

}
