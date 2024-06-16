package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
	HashMap <Integer, String> hm=new HashMap<>();
	//HashMap <Integer, String> hm1=new HashMap<>();
		hm.put(101, "Ram");
		hm.put(102, "Lakhan");
		hm.put(103, "Shyam");
		hm.put(104, null);
		
		//String s="AABBCC";
		//System.out.println(Character.codePointOf(s));
		
		//System.out.println(hm1.containsKey(s));
		
		
		//System.out.println(s.repeat(s));
		
		System.out.println(hm);
	for(Map.Entry<Integer,String> i: hm.entrySet()) {
		//System.out.println(i.getKey()+" "+i.getValue());
		System.out.println(i);
	}
		for(Integer i :hm.keySet()) {
			System.out.println(i);
		}
		

	}

}
