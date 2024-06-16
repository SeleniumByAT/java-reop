package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
	
		LinkedList <Integer> ll=new LinkedList <>();
		
		ll.add(20);
		ll.add(65);
		ll.add(45);
		ll.add(55);
		
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		System.out.println(ll.contains(55));
		System.out.println(ll.isEmpty());
		
		Iterator <Integer> ll1=ll.iterator();
		
		while(ll1.hasNext()) {
			System.out.println(ll1.next());
		}
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		
		
		
		
		

	}

}
