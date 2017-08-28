package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit{

	String message = "Hello";
	MessageUtil messageUtil = new MessageUtil(message);


	@Test
	public void testPrintMessage() {
		
		assertEquals("Hello", messageUtil.printMessage());
	}
	

	@Test
	public void testF1() {
		assertEquals(100, messageUtil.f1());
	}

}
