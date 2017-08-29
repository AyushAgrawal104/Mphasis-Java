package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.model.MessageUtil;

public class MessageTest {

	MessageUtil util = new MessageUtil("Praveen");

	@Test
	public void test() {

		assertEquals("Praveen", util.printMessage());

		// System.out.println(testMessage);
		// fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void test1() {
		assertEquals(100, util.f1());
	}

}
