package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	TreeSet <String> ts=new TreeSet <>();
	
	ts.add("Ajay");
	ts.add("Yash");
	ts.add("Akshay");
	ts.add("Uttam");
	ts.add("Shiv");
	
	
	System.out.println(ts);
	System.out.println(ts.contains("Shiv"));
	
	
	System.out.println("----------------------------");
	System.out.println(ts.descendingSet());
	
	
	
	System.out.println("----------------------------");
	for(String s:ts) {
		System.out.println(s);
	}
	
	
	System.out.println("----------------------------");
	Iterator <String> ts1=ts.iterator();
	while(ts1.hasNext()) {
		System.out.println(ts1.next());
	}
	
	System.out.println("----------------------------");
	
	System.out.println(ts.headSet("Akshay"));
	System.out.println(ts.tailSet("Shiv"));
	System.out.println(ts.subSet("Ajay", "Uttam"));
 System.out.println(ts.last());
	}

}
