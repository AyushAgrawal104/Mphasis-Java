package com;

import javax.swing.plaf.synth.SynthScrollBarUI;

class Xyz {
	static int count=0;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("-- Object is garbage collected "+(++count));
		
	}

}

public class GCDemo {

	public static void main(String[] args) {

		System.out.println("-- Test");

		   Runtime rt=Runtime.getRuntime();
		   System.out.println("-- Avaiable Space: "+rt.totalMemory());
		 
		   System.out.println("-- Free memory: "+rt.freeMemory());
		
		for (int i = 0; i <= 100000; i++) {
			Xyz x = new Xyz();
			
		}
		

		  System.out.println("-- Free memory: "+rt.freeMemory());
	}

}
