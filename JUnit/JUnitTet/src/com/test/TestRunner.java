package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.mphasis.MessageUtil;

public class TestRunner {

	public static void main(String[] args) {
		

		Result result = JUnitCore.runClasses(MessageTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure);

		}

		System.out.println("Result: "+result.wasSuccessful());

	}

}
