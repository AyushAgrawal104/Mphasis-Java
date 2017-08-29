package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.model.MessageUtil;

public class JUnitTest {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test(timeout = (2001))
	public void testPrintMessage() {
		
		try {
			Thread.sleep(2001);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
