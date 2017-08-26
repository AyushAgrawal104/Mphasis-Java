package com;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Hashtable<Object, Object> hm = new Hashtable<>();
		
		hm.put(1, "Abc");
		hm.put(10, "Xyz");
		hm.put(112, "Praveen");
		hm.put(646, "James");
		hm.put(15, "Abc");
		hm.put(10, "Kavya");
		hm.put(858, "Abc");
		hm.put(15, "jsdgjd");
		hm.put(2424, 3434);
		
		System.out.println(hm);
		
		/*Set s= hm.keySet();
		//Set s1=hm.entrySet();
		
		Iterator<Integer> it=s.iterator();
		
		//System.out.println(s1);
		while(it.hasNext()) {
			System.out.println(hm.get(it.next()));
		}
		
		//System.out.println(s);

		//System.out.println(hm);
*/	
	
	}
}
