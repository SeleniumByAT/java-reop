package oop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapprac {

	public static void main(String[] args) {
	
HashMap<Integer,String> hm=new HashMap<>();

hm.put(101, "Ram");
hm.put(102, "Shyam");		
hm.put(103, "Kanha");		
hm.put(104, "Laxman");		
		
		System.out.println(hm);
		hm.remove(104);
		System.out.println(hm);
		
		for( Map.Entry<Integer,String> i:hm.entrySet()) {
		System.out.println(i.getKey()+" "+i.getValue());
		}
	Set<Entry<Integer, String>> hm1	=hm.entrySet();
		Iterator <Entry<Integer, String>> hm2=hm1.iterator();
			while(hm2.hasNext()) {
				System.out.println(hm2.next());
			}
		List<String> l1=Arrays.asList("Sunita", "Babita", "Ramita");
		List<String> l2=Arrays.asList("Suraj", "Akash", "Vikash");
		
		HashMap<Integer, List<String>> list=new HashMap <> ();
		list.put(101, l1);
		list.put(102, l2);
		System.out.println(list);
		for(Map.Entry<Integer, List<String>> i:list.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		}
	}


