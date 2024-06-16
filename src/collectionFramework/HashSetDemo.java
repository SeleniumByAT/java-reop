package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
	HashSet <String> hs=new HashSet <>();
hs.add("Neeta");
hs.add("Megha");
hs.add("Sunita");
hs.add("Avinash");
hs.add(null);
	
	System.out.println(hs);
	
	//hs.clear();
	//System.out.println(hs);
	//hs.remove("Avinash");
	System.out.println(hs);
	
	for(String s:hs) {
		System.out.println(s);
	}
	
	List <String> hsl=new ArrayList <>(hs);
	System.out.println(hsl);
	
	hsl.addAll(hs);
	System.out.println(hsl);
	
	hsl.remove(0);
	System.out.println(hsl);
	
	
	
	}

}
