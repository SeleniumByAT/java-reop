package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList <Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		
		System.out.println(al.contains(20));
		System.out.println(al.isEmpty());
		System.out.println(al.equals(al));
		//System.out.println(al.remove(1));
		
	System.out.println(al.get(1));
	System.out.println(al.size());	
al.add(1, 20);
		System.out.println(al);
		
		System.out.println(al.contains(5));//al.remove(1);
	System.out.println(al);	
	System.out.println("---------------------------");
	
	for(Integer i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
for(Integer i:al) {
	System.out.println(i);
}
	
Iterator <Integer> it=al.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

	}

}
