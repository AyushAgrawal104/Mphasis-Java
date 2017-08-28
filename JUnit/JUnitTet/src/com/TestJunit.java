package com;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunit{

	String message = "Hello";
	MessageUtil messageUtil = new MessageUtil(message);

	
	@AfterClass()
	public static void f3() {
		System.out.println("--- Before class method");
	}
	
	@BeforeClass()
	public static void f4() {
		System.out.println("--- After class  method");
	}

	@After()
	public void f1() {
		System.out.println("--- after f1 method");
	}
	
	@Before
	public void f2() {
		System.out.println("--- before f1 method");
	}
	
	@
	public void testPrintMessage() {
		
		
		assertEquals("Hello", messageUtil.printMessage());
	}
	

	@Test
	public void testF1() {
		assertEquals(100, messageUtil.f1());
	}

}
