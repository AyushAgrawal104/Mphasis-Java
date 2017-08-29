package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mphasis.MessageUtil;

public class MessageTest {

	MessageUtil util = new MessageUtil("Praveen");

	@Test
	public void test() {

		assertEquals("Praveen", util.printMessage());

		// System.out.println(testMessage);
		// fail("Not yet implemented");
	}

	@Test
	public void test1() {
		assertEquals(100, util.f1());
	}

}
