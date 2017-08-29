package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.model.MessageUtil;

public class TestJunit2 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		 System.out.println("Inside testSalutationMessage()");
	    // message = "Hi!" + message;
	      assertEquals(message,messageUtil.salutationMessage());
	}


}
