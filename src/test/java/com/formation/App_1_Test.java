package com.formation;

import org.junit.Assert;
import org.junit.Test;

public class App_1_Test {
	private String INPUT = "123456";

	@Test
	public void testLength() {
		Assert.assertEquals(64, App_1.sha256hex(INPUT).length());
	}

	@Test
	public void testHex() {
		String expected = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
		Assert.assertEquals(expected, App_1.sha256hex(INPUT));
	}
}