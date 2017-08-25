package com;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Abc");
		
		System.out.println("SB: "+sb);
		System.out.println("HashCode Sb: "+System.identityHashCode(sb));
		sb.append("Xyz");
		System.out.println("SB: "+sb);
		System.out.println("HashCode Sb: "+System.identityHashCode(sb));
		sb.reverse();
		System.out.println("Reserse: "+sb);
		
		
		
		// StringBuilder
		
		
		
		
		
		
		
	}

}
