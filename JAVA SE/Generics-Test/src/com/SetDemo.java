package com;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		
		TreeSet<Object> hs=new TreeSet<>();
		
		hs.add(554);
		hs.add(224);
		hs.add(2);
		hs.add(6677);
		hs.add(8686);
		hs.add(233);
		
		/*System.out.println(hs);
		
		hs.remove('A');
		
		System.out.println(hs);
		*/
		

		/*for(Object obj:hs) {
			System.out.println(obj);
		}*/
		
		/*ListIterator<Object> li=hs.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}*/
		
		
		Iterator<Object> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
