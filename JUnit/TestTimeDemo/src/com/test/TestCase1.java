package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.model.MessageUtil;

public class TestCase1 {

	MessageUtil mu=new MessageUtil("Praveen");
	
	@Test
	public void testMessage() {
		
		assertEquals("Praveen", mu.printMessage());
		
	}
	
}
