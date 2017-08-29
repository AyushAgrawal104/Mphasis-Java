package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.model.MessageUtil;

public class JUnitTest {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test(expected=ArithmeticException.class)
	public void testPrintMessage() {
		
		int x=100/0;
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage();
		
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
