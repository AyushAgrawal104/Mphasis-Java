package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<>();

		ar.add("Abc");
		ar.add(new Integer(4545));
		ar.add(455.4f);
		ar.add('A');
		ar.add(4545);
		
		
		//System.out.println(ar);
		
	/*	ar.remove(0);

		System.out.println(ar.get(2));

		System.out.println(ar);
		
		ar.clear();
		System.out.println(ar);*/
		
		/*for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}*/
		
		/*for(Object obj:ar) {
			System.out.println(obj);
		}*/
		
		
		// Iterator
		
	/*	Iterator<Object> it=ar.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			
			if(obj.equals('A')) {
				it.remove();
				continue;
			}
			
			System.out.println(obj);
		}*/
		
		//System.out.println(ar);
		
		
		// ListIterator
		
		
		ListIterator<Object> li=ar.listIterator();
		
		while(li.hasNext()) {
			Object obj=li.next();
			if(obj.equals('A')) {
				li.add("Praveen");
				
			}
			
			//ar.add("Ozvitha");
			

			System.out.println(obj);
		}
		System.out.println("------------------------------------");
		System.out.println(ar);
	/*	
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
*/
	}

}
