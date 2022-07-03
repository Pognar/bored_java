package com.calitzgames.bored.krang;

import org.junit.Assert;
import org.junit.Test;

public class KrangTest {

	private final Krang mKrang = new Krang();

	@Test
	public void print_lin_test() {
		String testStr = "This is a test string";
		String returnedStr = mKrang.printLin(testStr);

		Assert.assertEquals(testStr, returnedStr);
	}
}
